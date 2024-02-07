// BOJ_2033_반올림

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2033 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int x = 1;
        int result = N;
        while (N>0){
            result = (int)((result/(double)x)+0.5)*x;
            x*=10;
            N/=10;
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}