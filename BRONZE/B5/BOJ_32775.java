// BOJ_32775_가희와 4시간의 벽 1

import java.util.Scanner;

public class BOJ_32775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        int h = sc.nextInt();
        int f = sc.nextInt();
        /* ==========sol========== */
        String result = "flight";
        if (h <= f) {
            result = "high speed rail";
        }
        /* ==========output========== */
        System.out.println(result);
        sc.close();
    }
}
