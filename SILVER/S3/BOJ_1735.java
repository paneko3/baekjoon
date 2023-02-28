// BOJ_1735_분수 합

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1735 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A1 = Integer.parseInt(st.nextToken());
        int B1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int A2 = Integer.parseInt(st.nextToken());
        int B2 = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        /* ==========output========== */
        System.out.print((A1*B2+A2*B1)/GCD(A1*B2+A2*B1,B1*B2) + " " + B1*B2/GCD(A1*B2+A2*B1,B1*B2));
        br.close();
    }
    static int GCD(int A, int B){
        if(A<=B){
            int temp =A;
            A = B;
            B = temp;
        }
        int C = A % B;
        if(C!=0){
            return GCD(B,C);
        }else {
            return B;
        }
    }
}
