// BOJ_1837_암호제작

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class BOJ_1837 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger p = new BigInteger(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        /* ==========sol========== */
        boolean[] isPrime = new boolean[k + 1];
        Arrays.fill(isPrime, true);
        
        for (int i = 2; i * i <= k; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= k; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        int badPrime = -1;
        for (int i = 2; i < k; i++) {
            if (isPrime[i]) {
                if (p.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
                    badPrime = i;
                    break;
                }
            }
        }
        
        /* ==========output========== */
        if (badPrime == -1) {
            System.out.println("GOOD");
        } else {
            System.out.println("BAD " + badPrime);
        }
        br.close();
    }
}
