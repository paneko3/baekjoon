// BOJ_13416_주식 투자

import java.io.*;
import java.util.*;

public class BOJ_13416 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();
        for (int testCase = 0; testCase < t; testCase++) {
            int n = Integer.parseInt(br.readLine());
            long totalProfit = 0;
            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                /* ==========sol========== */
                int maxDailyProfit = Math.max(a, Math.max(b, c));
                if (maxDailyProfit > 0) {
                    totalProfit += maxDailyProfit;
                }
            }
            result.append(totalProfit).append("\n");
        }
        /* ==========output========== */
        System.out.print(result);
        br.close();
    }
}
