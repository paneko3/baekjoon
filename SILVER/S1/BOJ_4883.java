// BOJ_4883_삼각 그래프

import java.io.*;
import java.util.*;

public class BOJ_4883 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = 1;

        while (true) {
            String line = br.readLine();
            if (line == null) break;
            int n = Integer.parseInt(line.trim());
            if (n == 0) break;

            long[][] cost = new long[n][3];
            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 3; j++) {
                    cost[i][j] = Long.parseLong(st.nextToken());
                }
            }

            /* ==========sol========== */
            long[][] dp = new long[n][3];

            dp[0][0] = 1_000_001; 
            dp[0][1] = cost[0][1];
            dp[0][2] = cost[0][1] + cost[0][2];

            for (int i = 1; i < n; i++) {
                dp[i][0] = cost[i][0] + Math.min(dp[i - 1][0], dp[i - 1][1]);

                dp[i][1] = cost[i][1] + Math.min(Math.min(dp[i - 1][0], dp[i - 1][1]), 
                                                Math.min(dp[i - 1][2], dp[i][0]));

                dp[i][2] = cost[i][2] + Math.min(Math.min(dp[i - 1][1], dp[i - 1][2]), dp[i][1]);
            }

            /* ==========output========== */
            System.out.println(tc + ". " + dp[n - 1][1]);
            tc++;
        }
        br.close();
    }
}
