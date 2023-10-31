// BOJ_10829_이진수 변환

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ_10829 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger N = new BigInteger(br.readLine());
        /* ==========sol========== */
        /* ==========output========== */
        System.out.println(N.toString(2));
        br.close();
    }
}