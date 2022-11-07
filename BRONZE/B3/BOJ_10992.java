// BOJ_10992_별 찍기 - 17

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10992 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        /* ==========sol========== */
        /* ==========output========== */
        for(int i=1;i<=N;i++){
            if(i==1){
                for(int j=1;j<=N-1;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }else if(i==N){
                for(int j=1;j<=2*N-1;j++){
                    System.out.print("*");
                }
            }else {
                for(int j=N-i;j>0;j--){
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int j=1;j<=(i-1)*2-1;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        br.close();
    }
}
