// BOJ_32326_Conveyor Belt Sushi

import java.util.Scanner;

public class BOJ_32326 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();

        /* ==========sol========== */
        int result = (r * 3) + (g * 4) + (b * 5);

        /* ==========output========== */
        System.out.println(result);
        sc.close();
    }
}
