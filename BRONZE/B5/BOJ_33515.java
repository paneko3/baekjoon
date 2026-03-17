// BOJ_33515_노트북 세 대를 가지고 왔다

import java.util.Scanner;

public class BOJ_33515 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();

        /* ==========sol========== */
        int result = Math.min(t1, t2);

        /* ==========output========== */
        System.out.println(result);
        sc.close();
    }
}
