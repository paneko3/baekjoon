// BOJ_2725_보이는 점의 개수

import java.util.Scanner;

public class BOJ_2725 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* ==========sol========== */
        int[] phi = new int[1001];
        for (int i = 1; i <= 1000; i++) phi[i] = i;
        for (int i = 2; i <= 1000; i++) {
            if (phi[i] == i) {
                for (int j = i; j <= 1000; j += i) {
                    phi[j] = phi[j] / i * (i - 1);
                }
            }
        }

        int[] dp = new int[1001];
        dp[1] = 3;
        for (int i = 2; i <= 1000; i++) {
            dp[i] = dp[i - 1] + (phi[i] * 2);
        }

        /* ==========input========== */
        int c = sc.nextInt();
        while (c-- > 0) {
            int n = sc.nextInt();

            /* ==========output========== */
            System.out.println(dp[n]);
        }
        sc.close();
    }
}
