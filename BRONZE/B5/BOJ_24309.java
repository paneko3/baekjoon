// BOJ_24309_РАВЕНСТВО

import java.io.*;
import java.math.BigInteger;

public class BOJ_24309 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger a = new BigInteger(br.readLine());
        BigInteger b = new BigInteger(br.readLine());
        BigInteger c = new BigInteger(br.readLine());

        /* ==========sol========== */
        BigInteger result = b.subtract(c).divide(a);

        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
