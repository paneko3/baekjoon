// BOJ_1524_세준세비

import java.io.*;
import java.util.*;

public class BOJ_1524 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int Smax = 0;
            int Bmax = 0;
            
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int S = Integer.parseInt(st.nextToken());
                if (Smax < S) {
                    Smax = S;
                }
            }
            
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int B = Integer.parseInt(st.nextToken());
                if (Bmax < B) {
                    Bmax = B;
                }
            }
            
            /* ==========sol========== */
            if (Smax > Bmax) {
                System.out.println("S");
            } else if (Bmax > Smax) {
                System.out.println("B");
            } else {
                System.out.println("S");
            }
        }
    }
}
