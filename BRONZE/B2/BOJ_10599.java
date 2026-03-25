// BOJ_10599_페르시아의 왕들

import java.util.Scanner;

public class BOJ_10599 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            /* ==========input========== */
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if (a == 0 && b == 0 && c == 0 && d == 0) break;

            /* ==========sol========== */
            int minAge = c - b;
            int maxAge = d - a;

            /* ==========output========== */
            System.out.println(minAge + " " + maxAge);
        }
        sc.close();
    }
}
