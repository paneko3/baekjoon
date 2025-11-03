// BOJ_28453_Previous Level

import java.io.*;
import java.util.*;

public class BOJ_28453 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        /* ==========sol========== */
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < N; i++) {
            int M = Integer.parseInt(st.nextToken());
            
            if (M == 300) {
                sb.append("1 ");
            } else if (M >= 275) {
                sb.append("2 ");
            } else if (M >= 250) {
                sb.append("3 ");
            } else {
                sb.append("4 ");
            }
        }

        /* ==========output========== */
        System.out.println(sb.toString().trim());
        br.close();
    }
}
