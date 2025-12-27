// BOJ_22193_Multiply

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class BOJ_22193 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        BigInteger a = new BigInteger(br.readLine());
        BigInteger b = new BigInteger(br.readLine());
        /* ==========sol========== */
        BigInteger result = a.multiply(b);
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
