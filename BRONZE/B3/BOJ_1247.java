// BOJ_1247_부호

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ_1247 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<3;i++){
            /* ==========input========== */
            int N = Integer.parseInt(br.readLine());
            BigInteger S = new BigInteger("0");
            for(int j=0;j<N;j++){
                S=S.add(new BigInteger(br.readLine()));
            }
            /* ==========sol========== */
            /* ==========output========== */
            if(S.compareTo(BigInteger.ZERO)==-1){
                System.out.println("-");
            }else if(S.compareTo(BigInteger.ZERO)==1){
                System.out.println("+");
            }else {
                System.out.println(0);
            }
        }
        br.close();
    }
}