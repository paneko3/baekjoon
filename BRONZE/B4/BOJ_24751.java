// BOJ_24751_Betting

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_24751 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double P = Double.parseDouble(br.readLine());

        /* ==========sol========== */
        double result1 = 100.0/P;
        double result2 = 100.0/(100-P);

        /* ==========output========== */
        System.out.println(result1+" "+result2);
        br.close();
    }
}
