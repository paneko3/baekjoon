// BOJ_5176_대회 자리

import java.io.*;
import java.util.*;

public class BOJ_5176 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        /* ==========sol========== */
        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < K; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int P = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            boolean[] taken = new boolean[M + 1]; 
            int cantJoin = 0;

            for (int i = 0; i < P; i++) {
                int seat = Integer.parseInt(br.readLine());
                if (taken[seat]) {
                    cantJoin++;
                } else {
                    taken[seat] = true;
                }
            }

            /* ==========output========== */
            sb.append(cantJoin).append("\n");
        }

        System.out.print(sb);
		br.close();
	}
}