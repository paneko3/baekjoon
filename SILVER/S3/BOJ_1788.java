// BOJ_1788_피보나치 수의 확장

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1788 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N==0){
            System.out.println(0);
            System.out.println(0);
            return;
        }
        int[] fib;
        /* ==========sol========== */
        /* ==========output========== */
        if(N>0){
            fib = new int[N+1];
            fib[0]=0;
            fib[1]=1;
            for(int i=2;i<=N;i++){
                fib[i]=(fib[i-1]+fib[i-2])%1000000000;
            }
            System.out.println(1);
            System.out.println(fib[N]);
        }else {
            N=-N;
            fib = new int[N+1];
            fib[0]=0;
            fib[1]=1;
            for(int i=2;i<=N;i++){
                fib[i]=(fib[i-2]-fib[i-1])%1000000000;
            }
            System.out.println(fib[N]>=0?1:-1);
            System.out.println(fib[N]>=0?fib[N]:-fib[N]);
        }
        br.close();
    }
}