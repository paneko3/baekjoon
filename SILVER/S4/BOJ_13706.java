// BOJ_13706_제곱근

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ_13706 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger N = new BigInteger(br.readLine());
        /* ==========sol========== */
        BigInteger left = new BigInteger("1");
        BigInteger right = N;
        BigInteger mid;
        while (true){
            mid = left.add(right).divide(BigInteger.TWO);
            int result = mid.multiply(mid).compareTo(N);
            if(result==0){
                break;
            }else if(result==1){
                right = mid.subtract(BigInteger.ONE);
            }else {
                left = mid.add(BigInteger.ONE);
            }
        }
        /* ==========output========== */
        System.out.println(mid);
        br.close();
    }
}