// BOJ_10991_별 찍기 - 16

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10991 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        /* ==========sol========== */
        /* ==========output========== */
        for(int i=1;i<=N;i++){
            for(int j=N-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        br.close();
    }
}
