// BOJ_16204_카드 뽑기

import java.io.*;
import java.util.*;

public class BOJ_16204 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int result = Math.min(m, k) + Math.min(n - m, n - k);
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
