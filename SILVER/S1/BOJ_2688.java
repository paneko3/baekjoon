// BOJ_2688_줄어들지 않아

import java.io.*;
import java.util.*;

public class BOJ_2688 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        /* ==========sol========== */
        long[][] dp = new long[65][10];

        for (int i = 0; i <= 9; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= 64; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= j; k++) {
                    dp[i][j] += dp[i - 1][k];
                }
            }
        }

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            long sum = 0;
            for (int i = 0; i <= 9; i++) {
                sum += dp[n][i];
            }
            sb.append(sum).append("\n");
        }

        /* ==========output========== */
        System.out.print(sb);
        br.close();
    }
}
