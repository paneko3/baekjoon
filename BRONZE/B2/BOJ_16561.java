// BOJ_16561_3의 배수

import java.util.Scanner;

public class BOJ_16561 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        int n = sc.nextInt();

        /* ==========sol========== */
        int k = n / 3;
        // (k-1)C2 = (k-1) * (k-2) / 2
        int ans = (k - 1) * (k - 2) / 2;

        /* ==========output========== */
        System.out.println(ans);
        sc.close();
    }
}
