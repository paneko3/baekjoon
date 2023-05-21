// BOJ_13241_최소공배수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_13241 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        /* ==========sol========== */
        /* ==========output========== */
        System.out.println(A*B/gcd(A,B));
        br.close();
    }
    static long gcd(long A, long B){
        if(B==0){
            return A;
        }else{
            return gcd(B,A%B);
        }
    }
}