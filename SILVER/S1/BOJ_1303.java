// BOJ_1303_전쟁 - 전투

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1303 {
    static int N, M, count;
    static char[][] map;
    static boolean[][] visited;
    static int[] dx = {0,-1,0,1};
    static int[] dy = {1,0,-1,0};
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        map = new char[N][M];
        for(int i=0;i<N;i++){
            String str = br.readLine();
            for(int j=0;j<M;j++){
                map[i][j] = str.charAt(j);
            }
        }
        /* ==========sol========== */
        int W=0;
        int B=0;
        visited = new boolean[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(!visited[i][j]){
                    count = 0;
                    dfs(i,j,map[i][j]);
                    if(map[i][j]=='W'){
                        W+=count*count;
                    }else {
                        B+=count*count;
                    }
                }
            }
        }
        /* ==========output========== */
        System.out.println(W + " " + B);
        br.close();
    }
    static void dfs(int row, int col,char c){
        if(visited[row][col]){
            return;
        }
        count++;
        visited[row][col]=true;
        for(int dir=0;dir<4;dir++){
            int nr = row + dx[dir];
            int nc = col + dy[dir];
            if(nr<0||nr>=N||nc<0||nc>=M||visited[nr][nc]||map[nr][nc]!=c){
                continue;
            }
            dfs(nr,nc,c);
        }
    }
}
