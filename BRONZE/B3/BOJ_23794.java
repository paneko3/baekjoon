// BOJ_23794_골뱅이 찍기 - 정사각형

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_23794 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        /* ==========output========== */
        for(int i=0;i<N+2;i++){
            for(int j=0;j<N+2;j++){
                if(i==0||i==(N+1)||j==0||j==(N+1)){
                    System.out.print("@");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        br.close();
    }
}