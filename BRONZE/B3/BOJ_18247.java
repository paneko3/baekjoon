// BOJ_18247_겨울왕국 티켓 예매

import java.io.*;
import java.util.*;

public class BOJ_18247 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            /* ==========sol========== */
            if (n < 12 || m < 4) {
                result.append("-1\n");
            } else {
                int seatNumber = 11 * m + 4;
                result.append(seatNumber).append("\n");
            }
        }
        /* ==========output========== */
        System.out.print(result);
        br.close();
    }
}
