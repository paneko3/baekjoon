// BOJ_12026_BOJ 거리

import java.util.Scanner;
import java.util.Arrays;

public class BOJ_12026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        int n = sc.nextInt();
        String s = sc.next();

        /* ==========sol========== */
        int[] dp = new int[n];
        int INF = 1000 * 1000 * 1000;
        Arrays.fill(dp, INF);
        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            if (dp[i] == INF) continue;

            char cur = s.charAt(i);
            char next = ' ';
            if (cur == 'B') next = 'O';
            else if (cur == 'O') next = 'J';
            else if (cur == 'J') next = 'B';

            for (int j = i + 1; j < n; j++) {
                if (s.charAt(j) == next) {
                    dp[j] = Math.min(dp[j], dp[i] + (j - i) * (j - i));
                }
            }
        }

        int result = (dp[n - 1] == INF) ? -1 : dp[n - 1];

        /* ==========output========== */
        System.out.println(result);
        sc.close();
    }
}
