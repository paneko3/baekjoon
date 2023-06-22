// BOJ_14928_큰 수 (BIG)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_14928 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        /* ==========sol========== */
        long result = 0;
        for(int i=0;i<N.length();i++){
            result = (result*10+(N.charAt(i)-'0'))%20000303;
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}