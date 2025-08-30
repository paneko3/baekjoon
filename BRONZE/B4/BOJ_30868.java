// BOJ_30868_개표

import java.io.*;
import java.util.*;

public class BOJ_30868 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            /* ==========sol========== */
            int bundleCount = n / 5;
            int remaining = n % 5;
            
            for (int j = 0; j < bundleCount; j++) {
                result.append("++++ ");
            }
            for (int j = 0; j < remaining; j++) {
                result.append("|");
            }
            result.append("\n");
        }
        /* ==========output========== */
        System.out.print(result);
        br.close();
    }
}
