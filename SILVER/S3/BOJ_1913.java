// BOJ_1913_달팽이

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1913 {
    static int[] dx ={1,0,-1,0};
    static int[] dy ={0,1,0,-1};
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        StringBuilder sb = new StringBuilder();
        int[] result = new int[2];
        int[][] map = new int[N][N];
        int count = N*N;
        int r = 0;
        int c = 0;
        int dir = 0;
        while (count>0){
            map[r][c]=count;
            if(count==M){
                result[0]=r+1;
                result[1]=c+1;
            }
            int nr = r + dx[dir];
            int nc = c + dy[dir];
            if(nr<0||nr>=N||nc<0||nc>=N||map[nr][nc]!=0){
                dir=dir==3?0:dir+1;
                nr = r + dx[dir];
                nc = c + dy[dir];
            }
            r = nr;
            c = nc;
            count--;
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                sb.append(map[i][j]).append(" ");
            }
            sb.append("\n");
        }
        sb.append(result[0]).append(" ").append(result[1]);
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
}