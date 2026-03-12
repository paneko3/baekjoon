// BOJ_5300_Fill the Rowboats!

import java.util.Scanner;

public class BOJ_5300 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        int N = sc.nextInt();

        /* ==========sol========== */
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(i).append(" ");
            // 6번째 해적이거나, 마지막 해적인 경우 "Go!" 추가
            if (i % 6 == 0 || i == N) {
                sb.append("Go! ");
            }
        }
        String result = sb.toString().trim();

        /* ==========output========== */
        System.out.println(result);
        sc.close();
    }
}
