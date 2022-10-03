// BOJ_1075_나누기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10996 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        if(N==1){
            System.out.println("*");
        }else {
            for(int i=1;i<=N*2;i++){
                if(i%2==1){
                    for(int j=1;j<=N;j++){
                        if(j%2==1){
                            System.out.print("*");
                        }else {
                            System.out.print(" ");
                        }
                    }
                }else {
                    for(int j=1;j<=N;j++){
                        if(j%2==1){
                            System.out.print(" ");
                        }else {
                            System.out.print("*");
                        }
                    }
                }
                System.out.println();
            }
        }
        /* ==========sol========== */
        /* ==========output========== */
        br.close();
    }
}
