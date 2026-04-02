// BOJ_18312_시각

import java.util.Scanner;

public class BOJ_18312 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        int n = sc.nextInt();
        int k = sc.nextInt();

        /* ==========sol========== */
        int count = 0;
        for (int h = 0; h <= n; h++) {
            for (int m = 0; m < 60; m++) {
                for (int s = 0; s < 60; s++) {
                    if (h / 10 == k || h % 10 == k || m / 10 == k || m % 10 == k || s / 10 == k || s % 10 == k) {
                        count++;
                    }
                }
            }
        }

        /* ==========output========== */
        System.out.println(count);
        sc.close();
    }
}
