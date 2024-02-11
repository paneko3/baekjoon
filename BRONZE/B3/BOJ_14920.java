// BOJ_14920_3n+1 수열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_14920 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int N = 1;
        while (true){
            if(C==1){
                break;
            }
            C=(C%2==0?C/2:3*C+1);
            N++;
        }
        /* ==========output========== */
        System.out.println(N);
        br.close();
    }
}