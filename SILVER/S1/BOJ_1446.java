// BOJ_1446_지름길

import java.io.*;
import java.util.*;

public class BOJ_1446 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        
        List<int[]> shortcuts = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int len = Integer.parseInt(st.nextToken());
            if (end <= d && end - start > len) {
                shortcuts.add(new int[]{start, end, len});
            }
        }

        /* ==========sol========== */
        int[] dp = new int[d + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 0; i <= d; i++) {
            if (i > 0) {
                dp[i] = Math.min(dp[i], dp[i - 1] + 1);
            }

            for (int[] road : shortcuts) {
                if (road[0] == i) {
                    dp[road[1]] = Math.min(dp[road[1]], dp[i] + road[2]);
                }
            }
        }

        /* ==========output========== */
        System.out.println(dp[d]);
        br.close();
    }
}
