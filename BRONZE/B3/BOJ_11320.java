// BOJ_11320_삼각 무늬 - 1

import java.util.Scanner;

public class BOJ_11320 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            /* ==========sol========== */
            int ratio = a / b;
            int result = ratio * ratio;

            /* ==========output========== */
            System.out.println(result);
        }
        sc.close();
    }
}
