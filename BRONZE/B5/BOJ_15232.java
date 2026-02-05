// BOJ_15232_Rectangles

import java.io.*;
import java.util.*;

public class BOJ_15232 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        /* ==========sol========== */
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        /* ==========output========== */
        System.out.print(sb);
        br.close();
    }
}
