// BOJ_4307_개미

import java.util.Scanner;

public class BOJ_4307 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        int t = sc.nextInt();

        while (t-- > 0) {
            int l = sc.nextInt();
            int n = sc.nextInt();

            int minTime = 0;
            int maxTime = 0;

            for (int i = 0; i < n; i++) {
                int pos = sc.nextInt();

                /* ==========sol========== */
                int antMin = Math.min(pos, l - pos);
                minTime = Math.max(minTime, antMin);

                int antMax = Math.max(pos, l - pos);
                maxTime = Math.max(maxTime, antMax);
            }

            /* ==========output========== */
            System.out.println(minTime + " " + maxTime);
        }
        sc.close();
    }
}
