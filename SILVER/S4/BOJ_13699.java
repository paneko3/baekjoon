// BOJ_13699_점화식

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class BOJ_13699 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        /* ==========sol========== */
        
        BigInteger[] dp = new BigInteger[N + 2];
        
        dp[0] = BigInteger.ONE;

        for (int i = 1; i <= N; i++) {
            dp[i] = BigInteger.ZERO;
            for (int j = 0; j < i; j++) {
                BigInteger term = dp[j].multiply(dp[i - 1 - j]);
                dp[i] = dp[i].add(term);
            }
        }
        
        BigInteger result = dp[N];

        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
