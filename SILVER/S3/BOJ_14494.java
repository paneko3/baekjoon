// BOJ_14494_다이나믹이 뭐예요?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_14494 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        long[][] dp = new long[n+1][m+1];
        for(int i=1;i<=n;i++){
            dp[i][1]=1;
        }
        for(int i=1;i<=m;i++){
            dp[1][i]=1;
        }
        for(int i=2;i<=n;i++){
            for(int j=2;j<=m;j++){
                dp[i][j]=(dp[i-1][j]+dp[i][j-1]+dp[i-1][j-1])%1000000007;
            }
        }
        /* ==========output========== */
        System.out.println(dp[n][m]);
        br.close();
    }
}