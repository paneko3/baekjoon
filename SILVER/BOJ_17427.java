// BOJ_17427_약수의 합 2

import java.io.*;
import java.util.*;

public class BOJ_17427 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        /* ==========sol========== */
        
        long sum = 0;
        for (int i = 1; i <= N; i++) {
            long count = N / i;
            sum += (long)i * count;
        }

        /* ==========output========== */
        System.out.println(sum);
        br.close();
    }
}
