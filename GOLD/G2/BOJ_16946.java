// BOJ_16946_벽 부수고 이동하기 4

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_16946 {
    static int N,M,index,count;
    static int[][] map,countMap;
    static boolean[][] visit;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static HashMap<Integer,Integer> hashMap;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        countMap = new int[N][M];
        hashMap = new HashMap<>();
        for(int i=0;i<N;i++){
            String str = br.readLine();
            for(int j=0;j<M;j++){
                map[i][j]= str.charAt(j) - '0';
            }
        }
        /* ==========sol========== */
        index=1;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(map[i][j]==0&&countMap[i][j]==0){
                    count=0;
                    dfs(i,j);
                    hashMap.put(index,count);
                    index++;
                }
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(map[i][j]==1){
                    ArrayList<Integer> list = new ArrayList<>();
                    for(int dir=0;dir<4;dir++){
                        int r = i +dx[dir];
                        int c = j +dy[dir];
                        if(r<0||r>=N||c<0||c>=M||countMap[r][c]==0){
                            continue;
                        }
                        if(list.contains(countMap[r][c])){
                            continue;
                        }
                        list.add(countMap[r][c]);
                        map[i][j]+=hashMap.get(countMap[r][c]);
                    }
                }
            }
        }
        /* ==========output========== */
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                sb.append(map[i][j]%10);
            }
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
    static void dfs(int i,int j){
        count++;
        countMap[i][j]=index;
        for(int dir=0;dir<4;dir++){
            int r = i +dx[dir];
            int c = j +dy[dir];
            if(r<0||r>=N||c<0||c>=M||countMap[r][c]!=0||map[r][c]!=0){
                continue;
            }
            dfs(r,c);
        }
    }
}