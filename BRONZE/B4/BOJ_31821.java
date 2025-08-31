// BOJ_31821_학식 사주기

import java.io.*;
import java.util.*;

public class BOJ_31821 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[] prices = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prices[i] = Integer.parseInt(br.readLine());
        }

        int m = Integer.parseInt(br.readLine());
        int totalCost = 0;
        for (int i = 0; i < m; i++) {
            int menuNumber = Integer.parseInt(br.readLine());
            /* ==========sol========== */
            totalCost += prices[menuNumber];
        }

        /* ==========output========== */
        System.out.println(totalCost);
        br.close();
    }
}
