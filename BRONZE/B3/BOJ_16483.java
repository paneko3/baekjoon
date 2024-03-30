// BOJ_16483_접시 안의 원

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_16483 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double T = Double.parseDouble(br.readLine());
        /* ==========sol========== */
        /* ==========output========== */
        System.out.println((int)(T/2*T/2));
        br.close();
    }
}