// BOJ_25377_빵

import java.io.*;
import java.util.*;

public class BOJ_25377 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int result = 2000;
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a <= b) {
                result = Math.min(result, b);
            }
        }
        if (result == 2000) {
            result = -1;
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
