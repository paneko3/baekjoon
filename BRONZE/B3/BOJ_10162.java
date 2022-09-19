// BOJ_10162_전자레인지

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10162 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int A =N/300;
        N%=300;
        int B =N/60;
        N%=60;
        int C =N/10;
        N%=10;
        /* ==========output========== */
        if(N!=0){
            System.out.println(-1);
        }else {
            System.out.println(A + " " + B + " "+ C);
        }
        br.close();
    }
}
