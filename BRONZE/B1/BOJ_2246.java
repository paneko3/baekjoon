// BOJ_2246_콘도 선정

import java.io.*;
import java.util.*;

public class BOJ_2246 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] condos = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            condos[i][0] = Integer.parseInt(st.nextToken());
            condos[i][1] = Integer.parseInt(st.nextToken());
        }

        /* ==========sol========== */
        Arrays.sort(condos, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            } else {
                return a[1] - b[1];
            }
        });

        int result = 1;
        int minCost = condos[0][1];

        for (int i = 1; i < N; i++) {
            if (condos[i][1] < minCost) {
                result++;
                minCost = condos[i][1];
            }
        }

        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
