// BOJ_5354_J박스

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5354 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int k=0;k<N;k++){
            /* ==========input========== */
            int J = Integer.parseInt(br.readLine());
            /* ==========sol========== */
            /* ==========output========== */
            for(int i=0;i<J;i++){
                for(int j=0;j<J;j++){
                    if(i==0||i==J-1||j==0||j==J-1){
                        System.out.print("#");
                    }else {
                        System.out.print("J");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
        br.close();
    }
}