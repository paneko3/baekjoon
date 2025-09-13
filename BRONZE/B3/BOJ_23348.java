// BOJ_23348_스트릿 코딩 파이터

import java.io.*;
import java.util.*;

public class BOJ_23348 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(br.readLine());
        int max = 0;

        /* ==========sol========== */
        for (int i = 0; i < N; i++) {
            int teamScore = 0;
            for (int j = 0; j < 3; j++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                teamScore += (A * a) + (B * b) + (C * c);
            }
            if (teamScore > max) {
                max = teamScore;
            }
        }

        /* ==========output========== */
        System.out.println(max);
        br.close();
    }
}
