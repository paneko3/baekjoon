// BOJ_5217_쌍의 합

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5217 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            int n = Integer.parseInt(br.readLine());
            System.out.print("Pairs for " + n +": ");
            for(int j=1;j<(n+1)/2;j++){
                System.out.print((j==1?"":", ") + j + " " + (n-j));
            }
            System.out.println();
        }
        br.close();
    }
}