// BOJ_28938_Конвейер

import java.util.Scanner;

public class BOJ_28938 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }

        /* ==========sol========== */
        String result;
        if (sum < 0) {
            result = "Left";
        } else if (sum > 0) {
            result = "Right";
        } else {
            result = "Stay";
        }

        /* ==========output========== */
        System.out.println(result);
        sc.close();
    }
}
