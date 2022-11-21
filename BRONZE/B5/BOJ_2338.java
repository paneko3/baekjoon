// BOJ_2338_긴자리 계산

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ_2338 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger A = new BigInteger(br.readLine());
        BigInteger B = new BigInteger(br.readLine());
        System.out.print(A.add(B)+"\n"+A.subtract(B)+"\n"+A.multiply(B));
        br.close();
    }
}
