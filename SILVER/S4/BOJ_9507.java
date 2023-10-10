// BOJ_9507_Generations of Tribbles

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9507 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        long[] fib = new long[68];
        fib[0]=1;
        fib[1]=1;
        fib[2]=2;
        fib[3]=4;
        for(int i=4;i<=67;i++){
            fib[i]=fib[i-1]+fib[i-2]+fib[i-3]+fib[i-4];
        }
        /* ==========output========== */
        for(int i=0;i<t;i++){
            int n = Integer.parseInt(br.readLine());
            System.out.println(fib[n]);
        }
        br.close();
    }
}