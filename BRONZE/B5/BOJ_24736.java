// BOJ_24736_Football Scoring

import java.io.*;
import java.util.*;

public class BOJ_24736 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        /* ==========sol========== */
        for (int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            int f = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int result = t * 6 + f * 3 + s * 2 + p * 1 + c * 2;
            sb.append(result).append(" ");
        }
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
}
