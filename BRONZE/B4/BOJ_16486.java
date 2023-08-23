// BOJ_16486_운동장 한 바퀴

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_16486 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double d1 = Double.parseDouble(br.readLine());
        double d2 = Double.parseDouble(br.readLine());
        System.out.printf("%f", d1*2+d2*2*3.141592);
        br.close();
    }
}