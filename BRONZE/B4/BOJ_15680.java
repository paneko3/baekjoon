// BOJ_15680_연세대학교

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_15680 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        /* ==========output========== */
        if(N==0){
            System.out.println("YONSEI");
        }else {
            System.out.println("Leading the Way to the Future");
        }
        br.close();
    }
}
