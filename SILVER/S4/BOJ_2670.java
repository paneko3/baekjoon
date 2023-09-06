// BOJ_2670_연속부분최대곱

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2670 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double[] num = new double[N+1];
        double[] dp = new double[N+1];
        double result = 0;
        for(int i=1;i<=N;i++){
            num[i]=Double.parseDouble(br.readLine());
            dp[i]=Math.max(num[i],dp[i-1]*num[i]);
            result=Math.max(result,dp[i]);
        }
        System.out.printf("%.3f",result);
        br.close();
    }
}