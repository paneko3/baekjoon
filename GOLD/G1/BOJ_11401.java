// BOJ_11401_이항 계수 3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11401 {
    static long mod = 1000000007;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long N=Long.parseLong(st.nextToken());
        long K=Long.parseLong(st.nextToken());
        /* ==========sol========== */
        long n = fac(N);
        long d = fac(K)*fac(N-K)%mod;
        /* ==========output========== */
        System.out.println(n*C(d,mod-2)%mod);
        br.close();
    }
    static long fac(long N){
        long temp = 1;
        while(N>1){
            temp = (temp*N)%mod;
            N--;
        }
        return temp;
    }
    static long C(long n, long k){
        long temp = 1;
        while (k>0){
            if(k%2==1){
                temp*=n;
                temp%=mod;
            }
            n = (n*n)%mod;
            k/=2;
        }
        return temp;
    }
}
