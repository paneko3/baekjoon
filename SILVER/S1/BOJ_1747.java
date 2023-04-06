// BOJ_1747_소수&팰린드롬

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ_1747 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        /* ==========sol========== */
        boolean[] prime =new boolean[1004001];
        prime[1]=true;
        for(int i=2;i*i<=1004001;i++){
            if(!prime[i]){
                for(int j=i*i;j<1004001;j+=i){
                    prime[j]=true;
                }
            }
        }
        /* ==========output========== */
        for(int i=Integer.parseInt(N);i<=1004000;i++){
            if(!prime[i]){
                if(isP(i)){
                    System.out.println(i);
                    break;
                }
            }
        }
        br.close();
    }
    static boolean isP(int i){
        String str = String.valueOf(i);
        char[] num = str.toCharArray();
        for(int j=0;j<num.length/2;j++){
            if(num[j]!=num[num.length-1-j]){
                return false;
            }
        }
        return true;
    }
}
