// BOJ_26574_Copier

import java.io.*;
import java.util.*;

public class BOJ_26574 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        /* ==========sol========== */
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String num = br.readLine();
            sb.append(num).append(" ").append(num).append("\n");
        }

        /* ==========output========== */
        System.out.print(sb);
        br.close();
    }
}
