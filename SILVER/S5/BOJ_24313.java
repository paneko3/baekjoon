// BOJ_24313_알고리즘_수업_점근적_표기_1

import java.io.*;
import java.util.*;

public class BOJ_24313 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        /* ==========sol========== */
        int left = a1 * n0 + a0;
        int right = c * n0;

        int result = (left <= right && a1 <= c) ? 1 : 0;

        /* ==========output========== */
        System.out.println(result);
    }
}
