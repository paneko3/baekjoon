// BOJ_15685_드래곤 커브

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_15685 {
    static int result;
    static int[][] map = new int[101][101];
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,-1,0,1};
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        result=0;
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());
            draw(x,y,d,g);
        }
        /* ==========sol========== */
        check();
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
    static void draw(int x, int y, int d, int g){
        ArrayList<Integer> list = new ArrayList<>();
        int temp = d;
        list.add(temp);
        for(int i=1;i<=g;i++){
            for(int j=list.size()-1;j>=0;j--){
                temp=(list.get(j)+1)%4;
                list.add(temp);
            }
        }
        int nextX = x;
        int nextY = y;
        for(int i=0;i<list.size();i++){
            map[nextY][nextX] = 1;
            nextX += dx[list.get(i)];
            nextY += dy[list.get(i)];
        }
        map[nextY][nextX] =1;
    }
    static void check(){
        int[] dx = {1,0,1};
        int[] dy = {0,1,1};
        int count =0;
        for(int i=0;i<map.length;i++){
            for(int j=0;j<map[0].length;j++){
                if(map[i][j]==1){
                    for(int k=0;k<3;k++){
                        int nextY= i + dy[k];
                        int nextX= j +dx[k];
                        if(nextY>=0&&nextY<101&&nextX>=0&&nextX<101&&map[nextY][nextX]==1){
                            count++;
                        }
                    }
                    if(count==3){
                        result++;
                    }
                    count=0;
                }
            }
        }
    }
}
