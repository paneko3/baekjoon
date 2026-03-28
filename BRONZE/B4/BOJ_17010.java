// BOJ_17010_Time to Decompress

import java.util.Scanner;

public class BOJ_17010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        int l = sc.nextInt();

        for (int i = 0; i < l; i++) {
            int n = sc.nextInt();
            String s = sc.next();

            /* ==========sol========== */
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append(s);
            }
            String result = sb.toString();

            /* ==========output========== */
            System.out.println(result);
        }
        sc.close();
    }
}
