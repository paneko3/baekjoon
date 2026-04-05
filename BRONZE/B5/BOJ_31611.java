// BOJ_31611_火曜日 (Tuesday)

import java.util.Scanner;

public class BOJ_31611 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        int x = sc.nextInt();

        /* ==========sol========== */
        int result = (x % 7 == 2) ? 1 : 0;

        /* ==========output========== */
        System.out.println(result);
        sc.close();
    }
}
