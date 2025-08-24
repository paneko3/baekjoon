// BOJ_11109_괴짜 교수

import java.io.*;
import java.util.*;

public class BOJ_11109 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();
        /* ==========sol========== */
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long d = Long.parseLong(st.nextToken());
            long n = Long.parseLong(st.nextToken());
            long s = Long.parseLong(st.nextToken());
            long p = Long.parseLong(st.nextToken());

            long serialWorkload = n * s;
            long parallelWorkload = d + (n * p);

            if (parallelWorkload < serialWorkload) {
                result.append("parallelize\n");
            } else if (parallelWorkload > serialWorkload) {
                result.append("do not parallelize\n");
            } else {
                result.append("does not matter\n");
            }
        }
        /* ==========output========== */
        System.out.print(result);
        br.close();
    }
}
