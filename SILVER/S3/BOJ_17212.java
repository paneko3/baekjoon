// BOJ_17212_달나라 토끼를 위한 구매대금 지불 도우미

import java.util.Scanner;

public class BOJ_17212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        int n = sc.nextInt();
        int[] dp = new int[n + 1];

        /* ==========sol========== */
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;
            
            if (i >= 2) dp[i] = Math.min(dp[i], dp[i - 2] + 1);
            if (i >= 5) dp[i] = Math.min(dp[i], dp[i - 5] + 1);
            if (i >= 7) dp[i] = Math.min(dp[i], dp[i - 7] + 1);
        }

        /* ==========output========== */
        System.out.println(dp[n]);
        sc.close();
    }
}
