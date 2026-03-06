// BOJ_31614_分 (Minutes)

import java.util.Scanner;

public class BOJ_31614 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        int H = sc.nextInt();
        int M = sc.nextInt();
        /* ==========sol========== */
        int totalMinutes = (H * 60) + M;
        /* ==========output========== */
        System.out.println(totalMinutes);
        sc.close();
    }
}
