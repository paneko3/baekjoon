// BOJ_14852_타일 채우기 3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_14852 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        if(N==1){
            System.out.println(2);
            return;
        }
        long[][] dp = new long[1000001][2];
        dp[0][0]=0;
        dp[1][0]=2;
        dp[2][0]=7;
        dp[2][1]=1;
        for(int i=3;i<=N;i++){
            dp[i][1] = (dp[i - 1][1] + dp[i - 3][0]) % 1000000007;
            dp[i][0] = (3 * dp[i - 2][0] + 2 * dp[i - 1][0] + 2 * dp[i][1]) % 1000000007;
        }
        /* ==========output========== */
        System.out.println(dp[N][0]);
        br.close();
    }
}