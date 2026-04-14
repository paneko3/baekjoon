// BOJ_28927_Киноманы

import java.util.Scanner;

public class BOJ_28927 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        int t1 = sc.nextInt();
        int e1 = sc.nextInt();
        int f1 = sc.nextInt();

        int t2 = sc.nextInt();
        int e2 = sc.nextInt();
        int f2 = sc.nextInt();

        /* ==========sol========== */
        // 트레일러(3분), 시리즈(20분), 영화(120분)
        int maxTotal = (t1 * 3) + (e1 * 20) + (f1 * 120);
        int melTotal = (t2 * 3) + (e2 * 20) + (f2 * 120);

        String result;
        if (maxTotal > melTotal) {
            result = "Max";
        } else if (melTotal > maxTotal) {
            result = "Mel";
        } else {
            result = "Draw";
        }

        /* ==========output========== */
        System.out.println(result);
        sc.close();
    }
}
