// BOJ_1952_달팽이2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1952 {
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        boolean[][] visit = new boolean[N][M];
        int result = 0;
        int dir = 0;
        int count = 0;
        int x = 0;
        int y = 0;
        visit[x][y]=true;
        count++;
        while (count!=N*M){
            int r = x + dx[dir];
            int c = y + dy[dir];
            if(r<0||r>=N||c<0||c>=M||visit[r][c]){
                dir=(dir==3?0:dir+1);
                result++;
            }else {
                count++;
                visit[r][c]=true;
                x = r;
                y = c;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}