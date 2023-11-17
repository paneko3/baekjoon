// BOJ_2436_공약수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2436 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long gcd = Integer.parseInt(st.nextToken());
        long lcd = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        long mul = gcd * lcd;
        long a = 0;
        long b = 0;
        for(long i=gcd;i<=Math.sqrt(mul);i+=gcd){
            if(mul%i==0&&f(i,mul/i)==gcd){
                a = i;
                b = mul/i;
            }
        }
        /* ==========output========== */
        System.out.println(a + " " + b);
        br.close();
    }
    static long f(long a, long b){
        long r = a % b;
        if(r == 0){
            return b;
        }else {
            return f(b,r);
        }
    }
}