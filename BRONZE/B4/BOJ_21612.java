// BOJ_21612_Boiling Water

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_21612 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int B = Integer.parseInt(br.readLine());
        int result = 5*B-400;
        /* ==========sol========== */
        /* ==========output========== */
        System.out.println(result);
        System.out.println(result<100?1:(result==100?0:-1));
        br.close();
    }
}