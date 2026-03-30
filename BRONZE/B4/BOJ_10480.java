// BOJ_10480_Oddities

import java.util.Scanner;

public class BOJ_10480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        int n = sc.nextInt();

        while (n-- > 0) {
            int x = sc.nextInt();

            /* ==========sol========== */
            String type = (x % 2 == 0) ? "even" : "odd";

            /* ==========output========== */
            System.out.println(x + " is " + type);
        }
        sc.close();
    }
}
