// BOJ_21591_Laptop Sticker

import java.util.Scanner;

public class BOJ_21591 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        int wc = sc.nextInt();
        int hc = sc.nextInt();
        int ws = sc.nextInt();
        int hs = sc.nextInt();

        /* ==========sol========== */
        int result = (wc >= ws + 2 && hc >= hs + 2) ? 1 : 0;

        /* ==========output========== */
        System.out.println(result);
        sc.close();
    }
}
