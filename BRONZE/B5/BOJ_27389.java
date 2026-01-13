// BOJ_27389_Metronome

import java.io.*;
import java.util.*;

public class BOJ_27389 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double n = Double.parseDouble(br.readLine());

        /* ==========sol========== */
        double result = n / 4.0;

        /* ==========output========== */
        System.out.printf("%.2f\n", result);
        br.close();
    }
}
