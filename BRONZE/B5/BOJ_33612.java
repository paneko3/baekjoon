// BOJ_33612_피갤컵

import java.io.*;
import java.util.*;

public class BOJ_33612 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int y = 2024, m = 8 + (n - 1) * 7;
        y += (m - 1) / 12; m = (m - 1) % 12 + 1;
        String result = y + " " + m;
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
