// BOJ_31606_果物 (Fruit)

import java.util.Scanner;

public class BOJ_31606 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        int x = sc.nextInt();
        int y = sc.nextInt();

        /* ==========sol========== */
        int result = x + y + 3;

        /* ==========output========== */
        System.out.println(result);
        sc.close();
    }
}
