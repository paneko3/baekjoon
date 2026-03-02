// BOJ_4714_Lunacy

import java.io.*;
import java.util.*;

public class BOJ_4714{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (String s = br.readLine(); s != null; s = br.readLine()) {
            /* ==========input========== */
            StringTokenizer st = new StringTokenizer(s);
            double n = Double.parseDouble(st.nextToken());
            if (n < 0) { break; }
            /* ==========sol========== */
            double result = n * 0.167;
            /* ==========output========== */
            System.out.printf("Objects weighing %.2f on Earth will weigh %.2f on the moon.\n", n, result);
        }
        br.close();
    }
}
