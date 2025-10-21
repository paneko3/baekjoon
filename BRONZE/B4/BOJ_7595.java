// BOJ_7595_Triangles

import java.io.*;
import java.util.*;

public class BOJ_7595 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String line;

        /* ==========sol========== */
        while ((line = br.readLine()) != null) {
            int n = Integer.parseInt(line.trim());
            
            if (n == 0) {
                break;
            }

            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < i; j++) {
                    sb.append('*');
                }
                sb.append('\n');
            }
        }

        /* ==========output========== */
        System.out.print(sb.toString());
        br.close();
    }
}
