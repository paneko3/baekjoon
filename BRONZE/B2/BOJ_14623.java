// BOJ_14623_감정이입

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_14623 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long B1 = Long.parseLong(br.readLine(),2);
        long B2 = Long.parseLong(br.readLine(),2);
        /* ==========sol========== */
        /* ==========output========== */
        System.out.println(Long.toBinaryString(B1*B2));
        br.close();
    }
}