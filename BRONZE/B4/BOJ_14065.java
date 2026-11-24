// BOJ_14065_Gorivo

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_14065 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double x = Double.parseDouble(br.readLine());

        /* ==========sol========== */
        double result = (100 * 3.785411784) / (1.609344 * x);

        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
