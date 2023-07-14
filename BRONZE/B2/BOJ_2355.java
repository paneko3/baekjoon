// BOJ_2355_시그마

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2355 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        if(A>B){
            long temp = B;
            B=A;
            A=temp;
        }
        /* ==========output========== */
        System.out.println(B*(B+1)/2-A*(A-1)/2);
        br.close();
    }
}