// BOJ_4150_피보나치 수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ_4150 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        BigInteger[] result = new BigInteger[n+1];
        for(int i=1;i<=n;i++){
            if(i==1||i==2){
                result[i]=new BigInteger("1");
            }else {
                result[i]=result[i-1].add(result[i-2]);
            }
        }
        /* ==========output========== */
        System.out.println(result[n].toString());
        br.close();
    }
}