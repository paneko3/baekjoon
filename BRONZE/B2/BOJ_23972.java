// BOJ_23972_악마의 제안

import java.io.*;
import java.util.*;

public class BOJ_23972 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long K = Long.parseLong(st.nextToken());
        long N = Long.parseLong(st.nextToken());

        /* ==========sol========== */
        if (N == 1) {
            System.out.println(-1);
        } else {
            long numerator = K * N;
            long denominator = N - 1;
            long result = (numerator + denominator - 1) / denominator;
            System.out.println(result);
        }
        
        /* ==========output========== */
        br.close();
    }
}
