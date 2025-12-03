// BOJ_27434_팩토리얼 3

import java.io.*;
import java.util.*;
import java.math.*;

public class BOJ_27434 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        BigInteger result = solve(1, n);
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }

    static BigInteger solve(int a, int n) {
        if (a > n) {
            return BigInteger.ONE;
        }
        if (a == n) {
            return BigInteger.valueOf(a);
        }
        int mid = (a + n) / 2;
        return solve(a, mid).multiply(solve(mid + 1, n));
    }
}
