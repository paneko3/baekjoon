// BOJ_3758_KCPC

import java.io.*;
import java.util.*;

public class BOJ_3758 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int tc = 0; tc < T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            /* ==========sol========== */
            int[][] scores = new int[n + 1][k + 1];
            int[] total = new int[n + 1];
            int[] count = new int[n + 1];
            int[] last = new int[n + 1];
            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int id = Integer.parseInt(st.nextToken());
                int num = Integer.parseInt(st.nextToken());
                int s = Integer.parseInt(st.nextToken());
                if (s > scores[id][num]) {
                    total[id] += s - scores[id][num];
                    scores[id][num] = s;
                }
                count[id]++;
                last[id] = i;
            }
            int result = 1;
            for (int i = 1; i <= n; i++) {
                if (i == t) continue;
                if (total[i] > total[t]) {
                    result++;
                } else if (total[i] == total[t]) {
                    if (count[i] < count[t]) {
                        result++;
                    } else if (count[i] == count[t]) {
                        if (last[i] < last[t]) {
                            result++;
                        }
                    }
                }
            }
            sb.append(result).append("\n");
        }
        /* ==========output========== */
        System.out.print(sb);
        br.close();
    }
}
