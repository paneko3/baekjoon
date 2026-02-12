// BOJ_15610_Abbey Courtyard

import java.io.*;

public class BOJ_15610 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long a = Long.parseLong(br.readLine());

        /* ==========sol========== */
        double side = Math.sqrt(a);
        double perimeter = side * 4;

        /* ==========output========== */
        System.out.printf("%.8f\n", perimeter);
        br.close();
    }
}
