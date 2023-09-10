// BOJ_3004_체스판 조각

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_3004 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int result = 0;
        if(N%2==0){
            result=(N/2+1)*(N/2+1);
        }else {
            result=(N/2+1)*(N/2+2);
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}