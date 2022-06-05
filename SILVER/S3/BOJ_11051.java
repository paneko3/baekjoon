// BOJ_11051_이항 계수 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11051 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int[][] dp = new int[N+1][N+1];
        for(int i=0;i<=N;i++){
            for(int j=0;j<=i;j++){
                if(j==0||j==i)
                    dp[i][j]=1;
                else
                    dp[i][j]=(dp[i-1][j-1]+dp[i-1][j])%10007;
            }
        }
        /* ==========output========== */
        System.out.println(dp[N][K]);
        br.close();
    }
}
