// BOJ_16931_겉넓이 구하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_16931 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] map = new int[N][M];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                map[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        /* ==========sol========== */
        int result = 2*N*M;
        for(int i=0;i<N;i++){
            for(int j=M-1;j>=1;j--){
                int h = map[i][j-1]-map[i][j];
                if(h>=0){
                    result+=h;
                }
            }
            result+=map[i][M-1];
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<M-1;j++){
                int h = map[i][j+1] - map[i][j];
                if(h >= 0) {
                    result += h;
                }
            }
            result += map[i][0];
        }
        for(int j=0; j<M; j++) {
            for(int i=N-1; i>=1; i--) {
                int h = map[i-1][j] - map[i][j];
                if(h >= 0) {
                    result += h;
                }
            }
            result += map[N-1][j];
        }
        for(int j=0; j<M; j++) {
            for(int i=0; i<N-1; i++) {
                int h = map[i+1][j] - map[i][j];
                if(h >= 0) {
                    result += h;
                }
            }
            result += map[0][j];
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}