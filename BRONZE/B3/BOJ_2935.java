// BOJ_2935_소음

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ_2935 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger A = new BigInteger(br.readLine());
        String operator = br.readLine();
        BigInteger B = new BigInteger(br.readLine());
        /* ==========sol========== */
        /* ==========output========== */
        if(operator.equals("+")){
            System.out.println(A.add(B));
        }else {
            System.out.println(A.multiply(B));
        }
        br.close();
    }
}
