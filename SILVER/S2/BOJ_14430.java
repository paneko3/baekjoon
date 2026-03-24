// BOJ_14430_자원 캐기

import java.util.Scanner;

public class BOJ_14430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] map = new int[n][m];
        int[][] dp = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        /* ==========sol========== */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int fromUp = (i > 0) ? dp[i - 1][j] : 0;
                int fromLeft = (j > 0) ? dp[i][j - 1] : 0;
                
                dp[i][j] = Math.max(fromUp, fromLeft) + map[i][j];
            }
        }

        /* ==========output========== */
        System.out.println(dp[n - 1][m - 1]);
        sc.close();
    }
}
