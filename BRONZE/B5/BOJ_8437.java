// BOJ_8437_Julka

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class BOJ_8437 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger S = new BigInteger(br.readLine());
        BigInteger D = new BigInteger(br.readLine());

        /* ==========sol========== */
        BigInteger TWO = new BigInteger("2");
        
        BigInteger K = S.add(D).divide(TWO);
        
        BigInteger N = S.subtract(D).divide(TWO);

        /* ==========output========== */
        System.out.println(K);
        System.out.println(N);
        br.close();
    }
}
