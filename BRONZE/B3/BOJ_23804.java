// BOJ_23804_골뱅이 찍기 - ㄷ

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_23804 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        /* ==========output========== */
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print("@@@@@");
            }
            System.out.println();
        }
        for(int i=0;i<3*N;i++){
            for(int j=0;j<N;j++){
                System.out.print("@");
            }
            System.out.println();
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print("@@@@@");
            }
            System.out.println();
        }
        br.close();
    }
}