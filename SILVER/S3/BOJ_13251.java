// BOJ_13251_조약돌 꺼내기

import java.io.*;
import java.util.*;

public class BOJ_13251 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine()), N = 0;
        int[] arr = new int[M];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) { arr[i] = Integer.parseInt(st.nextToken()); N += arr[i]; }
        int K = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        double result = 0.0;
        for (int i = 0; i < M; i++) {
            if (arr[i] >= K) {
                double prob = 1.0;
                for (int j = 0; j < K; j++) { prob *= (double) (arr[i] - j) / (N - j); }
                result += prob;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
