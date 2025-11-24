// BOJ_2312_수 복원하기

import java.io.*;
import java.util.*;

public class BOJ_2312 {
    
    private static void factorize(int N, StringBuilder sb) {
        for (int p = 2; p * p <= N; p++) {
            if (N % p == 0) {
                int count = 0;
                while (N % p == 0) {
                    N /= p;
                    count++;
                }
                sb.append(p).append(" ").append(count).append('\n');
            }
        }
        
        if (N > 1) {
            sb.append(N).append(" ").append(1).append('\n');
        }
    }

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();

        /* ==========sol========== */
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            factorize(N, sb);
        }

        /* ==========output========== */
        System.out.print(sb.toString());
        br.close();
    }
}
