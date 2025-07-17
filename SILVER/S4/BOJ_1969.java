// BOJ_1969_DNA

import java.io.*;
import java.util.*;

public class BOJ_1969 {
    static final char[] dna = {'A', 'C', 'G', 'T'};

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        String[] arr = new String[N];
        for(int i = 0; i < N; i++) arr[i] = br.readLine();

        /* ==========sol========== */
        StringBuilder sb = new StringBuilder();
        int totalDistance = 0;

        for(int i = 0; i < M; i++) {
            int[] count = new int[4]; // A=0, C=1, G=2, T=3
            for(int j = 0; j < N; j++) {
                char c = arr[j].charAt(i);
                if(c == 'A') count[0]++;
                else if(c == 'C') count[1]++;
                else if(c == 'G') count[2]++;
                else if(c == 'T') count[3]++;
            }

            int max = 0, idx = 0;
            for(int k = 0; k < 4; k++) {
                if(count[k] > max) {
                    max = count[k];
                    idx = k;
                }
            }

            sb.append(dna[idx]);
            totalDistance += N - max;
        }

        /* ==========output========== */
        System.out.println(sb);
        System.out.println(totalDistance);
    }
}
