// BOJ_10995_별 찍기 - 20

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10995 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        /* ==========output========== */
        for(int i=1;i<=N;i++){
            if(i%2==0){
                System.out.print(" ");
            }
            for(int j=1;j<=N;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        br.close();
    }
}
