// BOJ_9699_RICE SACK

import java.io.*;
import java.util.*;

public class BOJ_9699 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();

        /* ==========sol========== */
        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int max = 0;
            for (int j = 0; j < 5; j++) {
                int weight = Integer.parseInt(st.nextToken());
                if (weight > max) {
                    max = weight;
                }
            }
            /* ==========output========== */
            result.append("Case #").append(i).append(": ").append(max).append("\n");
        }
        System.out.print(result);
        br.close();
    }
}
