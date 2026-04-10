// BOJ_31090_2023은 무엇이 특별할까?

import java.util.Scanner;

public class BOJ_31090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            /* ==========sol========== */
            int lastTwoDigits = n % 100;
            String result;

            if ((n + 1) % lastTwoDigits == 0) {
                result = "Good";
            } else {
                result = "Bye";
            }

            /* ==========output========== */
            System.out.println(result);
        }
        sc.close();
    }
}
