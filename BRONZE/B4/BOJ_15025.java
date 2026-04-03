// BOJ_15025_Judging Moose

import java.util.Scanner;

public class BOJ_15025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        int l = sc.nextInt();
        int r = sc.nextInt();

        /* ==========sol========== */
        String result;
        if (l == 0 && r == 0) {
            result = "Not a moose";
        } else if (l == r) {
            result = "Even " + (l + r);
        } else {
            int maxTines = Math.max(l, r);
            result = "Odd " + (maxTines * 2);
        }

        /* ==========output========== */
        System.out.println(result);
        sc.close();
    }
}
