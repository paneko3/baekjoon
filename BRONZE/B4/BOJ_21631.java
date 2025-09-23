// BOJ_21631_Checkers

import java.io.*;
import java.util.*;

public class BOJ_21631 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        /* ==========sol========== */
        long result;
        if (b == 0) {
            result = 0;
        } else {
            result = Math.min(a + 1, b);
        }

        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
