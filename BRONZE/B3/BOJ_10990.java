// BOJ_10990_별 찍기 - 15

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10990 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N =Integer.parseInt(br.readLine());
        /* ==========sol========== */
        /* ==========output========== */
        for(int i=1;i<=N;i++){
            for(int j=N-1-i;j>=0;j--){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=0;j<2*i-3;j++){
                System.out.print(" ");
            }
            if(i!=1){
                System.out.print("*");
            }
            System.out.println();
        }
        br.close();
    }
}
