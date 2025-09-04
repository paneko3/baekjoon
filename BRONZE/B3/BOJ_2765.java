// BOJ_2765_자전거 속도

import java.io.*;
import java.util.*;

public class BOJ_2765 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int trip = 1;

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double d = Double.parseDouble(st.nextToken());
            int cnt = Integer.parseInt(st.nextToken());
            double t = Double.parseDouble(st.nextToken());

            /* ==========sol========== */
            if (cnt == 0) {
                break;
            }

            double distance = Math.PI * d * cnt / (12 * 5280);
            double mph = distance / t * 3600;

            /* ==========output========== */
            result.append("Trip #").append(trip++).append(": ");
            result.append(String.format("%.2f", distance)).append(" ");
            result.append(String.format("%.2f", mph)).append("\n");
        }
        System.out.print(result);
        br.close();
    }
}
