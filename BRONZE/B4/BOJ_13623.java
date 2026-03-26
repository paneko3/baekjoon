// BOJ_13623_Zero or One

import java.util.Scanner;

public class BOJ_13623 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        /* ==========sol========== */
        char result;
        if (a != b && a != c) {
            result = 'A';
        } else if (b != a && b != c) {
            result = 'B';
        } else if (c != a && c != b) {
            result = 'C';
        } else {
            result = '*';
        }

        /* ==========output========== */
        System.out.println(result);
        sc.close();
    }
}
