// BOJ_1816_암호 키

import java.util.Scanner;

public class BOJ_1816 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        int n = sc.nextInt();

        while (n-- > 0) {
            long s = sc.nextLong();

            /* ==========sol========== */
            boolean isGood = true;
            for (long i = 2; i <= 1000000; i++) {
                if (s % i == 0) {
                    isGood = false;
                    break;
                }
            }

            /* ==========output========== */
            if (isGood) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
