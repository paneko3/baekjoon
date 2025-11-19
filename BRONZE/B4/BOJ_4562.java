// BOJ_4562_No Brainer

import java.io.*;
import java.util.*;

public class BOJ_4562 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        /* ==========sol========== */
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            
            if (X >= Y) {
                sb.append("MMM BRAINS").append('\n');
            } else {
                sb.append("NO BRAINS").append('\n');
            }
        }

        /* ==========output========== */
        System.out.print(sb.toString());
        br.close();
    }
}
