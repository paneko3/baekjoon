// BOJ_5598_카이사르 암호

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5598 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        /* ==========sol========== */
        /* ==========output========== */
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            System.out.print((char)(c-'A'-3>=0?c-3:c+23));
        }
        br.close();
    }
}