// BOJ_16396_선 그리기

import java.io.*;
import java.util.*;

public class BOJ_16396 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        /* ==========sol========== */
        boolean[] covered = new boolean[10001];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());

            for (int j = X; j < Y; j++) {
                covered[j] = true;
            }
        }

        int total_length = 0;
        for (int i = 1; i <= 10000; i++) {
            if (covered[i]) {
                total_length++;
            }
        }

        /* ==========output========== */
        System.out.println(total_length);
        br.close();
    }
}
