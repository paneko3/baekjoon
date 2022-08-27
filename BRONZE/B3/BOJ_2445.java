// BOJ_2445_별 찍기 - 8

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2445 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        /* ==========sol========== */
        for(int i=1;i<=N;i++){
            for(int j=1;j<=2*N;j++){
                if(j<=i||j>2*N-i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=N-1;i>0;i--){
            for(int j=1;j<=2*N;j++){
                if(j<=i||j>2*N-i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        /* ==========output========== */
        br.close();
    }
}
