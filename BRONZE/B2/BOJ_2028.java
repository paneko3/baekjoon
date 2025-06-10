// BOJ_2028_자기복제수

import java.io.*;
import java.util.*;

public class BOJ_2028 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        /* ==========sol========== */
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            long sq = (long) N * N;
            if (sq % (int)Math.pow(10, String.valueOf(N).length()) == N) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }

        /* ==========output========== */
        System.out.print(sb);
    }
}
