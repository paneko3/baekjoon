// BOJ_11508_2+1 세일

import java.io.*;
import java.util.*;

public class BOJ_11508 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Integer[] C = new Integer[N];
        for (int i = 0; i < N; i++) {
            C[i] = Integer.parseInt(br.readLine());
        }

        /* ==========sol========== */
        
        Arrays.sort(C, Collections.reverseOrder());
        
        long minCost = 0;

        for (int i = 0; i < N; i++) {
            if ((i + 1) % 3 == 0) {
                continue;
            }
            
            minCost += C[i];
        }

        /* ==========output========== */
        System.out.println(minCost);
        br.close();
    }
}
