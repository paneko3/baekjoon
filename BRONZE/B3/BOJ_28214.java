// BOJ_28214_크림빵

import java.io.*;
import java.util.*;

public class BOJ_28214 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int[] breads = new int[N * K];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N * K; i++) {
            breads[i] = Integer.parseInt(st.nextToken());
        }

        /* ==========sol========== */
        int sellableBundles = 0;
        
        for (int i = 0; i < N; i++) {
            int nonCreamCount = 0;
            for (int j = 0; j < K; j++) {
                int index = (i * K) + j;
                if (breads[index] == 0) {
                    nonCreamCount++;
                }
            }
            
            if (nonCreamCount < P) {
                sellableBundles++;
            }
        }

        /* ==========output========== */
        System.out.println(sellableBundles);
        br.close();
    }
}
