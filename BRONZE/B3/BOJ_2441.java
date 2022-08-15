// BOJ_2441_별 찍기 - 4

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2441 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        /* ==========sol========== */
        /* ==========output========== */
        for(int i=N;i>0;i--){
            for(int j=i;j<N;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        br.close();
    }
}
