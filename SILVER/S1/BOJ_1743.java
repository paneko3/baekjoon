// BOJ_1743_음식물 피하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1743 {
    static int N,M,K,count;
    static boolean[][] map,visited;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        map = new boolean[N+1][M+1];
        visited = new boolean[N+1][M+1];
        for(int i=0;i<K;i++){
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            map[r][c]=true;
        }
        /* ==========sol========== */
        int result=0;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=M;j++){
                if(map[i][j]&&!visited[i][j]){
                    count=0;
                    dfs(i,j);
                    result = Math.max(result,count);
                }
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
    static void dfs(int r, int c){
        count++;
        visited[r][c]=true;
        for(int dir=0;dir<4;dir++){
            int nr = r + dx[dir];
            int nc = c + dy[dir];
            if(nr<=0||nr>N||nc<=0||nc>M||visited[nr][nc]||!map[nr][nc]){
                continue;
            }
            dfs(nr,nc);
        }
    }
}
