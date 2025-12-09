// BOJ_28701_세제곱의 합

import java.io.*;
import java.util.*;

public class BOJ_28701 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int result1 = 0;
        int result3 = 0;
        for (int i = 1; i <= n; i++) {
            result1 += i;
            result3 += i * i * i;
        }
        int result2 = result1 * result1;
        /* ==========output========== */
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        br.close();
    }
}
