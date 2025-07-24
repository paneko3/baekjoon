// BOJ_1500_최대 곱

import java.io.*;
import java.util.*;

public class BOJ_1500 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        long result = 1;
        int base = s / k;
        int remainder = s % k;
        for (int i = 0; i < k; i++) {
            if (i < remainder) {
                result *= (base + 1);
            } else {
                result *= base;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
