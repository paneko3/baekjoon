// BOJ_2193_이친수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2193 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        /* ==========sol========== */
        long []dp=new long[N+1];
        dp[1]=1;
        for(int i=2;i<=N;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        /* ==========output========== */
        System.out.println(dp[N]);
        br.close();
    }
}
