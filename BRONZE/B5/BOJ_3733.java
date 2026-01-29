// BOJ_3733_Shares

import java.io.*;
import java.util.*;

public class BOJ_3733 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        Scanner sc = new Scanner(System.in);

        /* ==========sol========== */
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int x = s / (n + 1);

            /* ==========output========== */
            System.out.println(x);
        }
        sc.close();
    }
}
