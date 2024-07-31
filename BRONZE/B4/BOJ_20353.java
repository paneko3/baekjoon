// BOJ_20353_Atrium

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_20353 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(br.readLine());
        /* ==========sol========== */
        /* ==========output========== */
        System.out.printf("%.8f",Math.sqrt(a)*4);
        br.close();
    }
}