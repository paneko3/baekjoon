// BOJ_27866_문자와 문자열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_27866 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int i = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        /* ==========output========== */
        System.out.println(S.charAt(i-1));
        br.close();
    }
}