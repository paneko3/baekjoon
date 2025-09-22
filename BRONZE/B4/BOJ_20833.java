// BOJ_20833_Kuber

import java.io.*;
import java.util.*;

public class BOJ_20833 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        /* ==========sol========== */
        long sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += (long) i * i * i;
        }

        /* ==========output========== */
        System.out.println(sum);
        br.close();
    }
}
