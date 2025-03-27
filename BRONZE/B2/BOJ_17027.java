// BOJ_17027_Shell Game

import java.io.*;
import java.util.*;

public class BOJ_17027 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] swaps = new int[N][3];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            swaps[i][0] = Integer.parseInt(st.nextToken()); // a
            swaps[i][1] = Integer.parseInt(st.nextToken()); // b
            swaps[i][2] = Integer.parseInt(st.nextToken()); // g
        }
        /* ==========sol========== */
        int maxScore = 0;
        for (int start = 1; start <= 3; start++) {
            int pos = start;
            int score = 0;
            for (int i = 0; i < N; i++) {
                int a = swaps[i][0];
                int b = swaps[i][1];
                int g = swaps[i][2];
                if (pos == a) {
                	pos = b;
                } else if (pos == b) {
                	pos = a;
                }
                if (pos == g) {
                	score++;
                }
            }
            maxScore = Math.max(maxScore, score);
        }

        /* ==========output========== */
        System.out.println(maxScore);
		br.close();
	}
}