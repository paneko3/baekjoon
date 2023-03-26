// BOJ_9656_돌 게임 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9656 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        /* ==========output========== */
        if(N%2==1){
            System.out.println("CY");
        }else {
            System.out.println("SK");
        }
        br.close();
    }
}
