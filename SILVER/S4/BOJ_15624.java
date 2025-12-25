// BOJ_15624_피보나치 수 7

import java.io.*;
import java.util.*;

public class BOJ_15624 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int[] dp = new int[n + 1];
        if (n > 0) { dp[1] = 1; }
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
        }
        int result = dp[n];
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
