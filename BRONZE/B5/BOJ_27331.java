// BOJ_27331_2 桁の整数 (Two-digit Integer)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_27331 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = br.readLine() + br.readLine();
        /* ==========sol========== */
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
