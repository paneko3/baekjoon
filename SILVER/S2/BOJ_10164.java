// BOJ_10164_격자상의 경로

import java.io.*;
import java.util.*;

public class BOJ_10164 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		int ans = 0;
        int[][] dp = new int[N][M];
        dp[0][0] = 0;
        if(K!=0){
            int kRow = K/M;
            int kCol = K%M;
            if(K%M == 0) {	
                kRow -= 1;
                kCol = M-1;
            }else kCol-=1;
            for(int i = 1; i<=kRow; i++) {
                dp[i][0] = 1;
            }
            for(int i = 1; i<=kCol; i++){
                dp[0][i] = 1;
            }
            for(int i = 1; i<=kRow; i++){
                for(int j = 1; j<=kCol; j++){
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
            for(int i = kRow+1; i<N; i++) dp[i][kCol] = dp[kRow][kCol];
            for(int j = kCol+1; j<M; j++) dp[kRow][j] = dp[kRow][kCol];
            for(int i = kRow+1; i<N; i++){
                for(int j = kCol+1; j<M; j++){
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        else{
            for(int i = 1; i<N; i++) {
                dp[i][0] = 1;
            }
            for(int i = 1; i<M; i++){
                dp[0][i] = 1;
            }
            for(int i = 1; i<N; i++){
                for(int j = 1; j<M; j++){
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
		/* ==========output========== */
        System.out.println(dp[N-1][M-1]);
		br.close();
	}
}
