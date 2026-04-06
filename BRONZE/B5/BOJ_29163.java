// BOJ_29163_Счастье Мистера Бина

import java.util.Scanner;

public class BOJ_29163 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        int n = sc.nextInt();
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        /* ==========sol========== */
        String result = (evenCount > oddCount) ? "Happy" : "Sad";

        /* ==========output========== */
        System.out.println(result);
        sc.close();
    }
}
