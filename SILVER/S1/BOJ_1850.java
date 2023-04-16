// BOJ_1850_최대공약수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1850 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());
        /* ==========sol========== */
        long result = gcd(N,M);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<result;i++){
            sb.append(1);
        }
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
    static long gcd(long a, long b){
        if(a%b==0){
            return b;
        }else {
            return gcd(b,a%b);
        }
    }
}
