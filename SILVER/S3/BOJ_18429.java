// BOJ_18429_근손실

import java.io.*;
import java.util.*;

public class BOJ_18429 {
    static int N, K;
    static int[] kits;
    static boolean[] used;
    static int result = 0;

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        kits = new int[N];
        used = new boolean[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            kits[i] = Integer.parseInt(st.nextToken());
        }

        /* ==========sol========== */
        dfs(0, 500);

        /* ==========output========== */
        System.out.println(result);
        br.close();
    }

    public static void dfs(int depth, int weight) {
        if (depth == N) {
            result++;
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!used[i]) {
                int nextWeight = weight - K + kits[i];
                if (nextWeight >= 500) {
                    used[i] = true;
                    dfs(depth + 1, nextWeight);
                    used[i] = false;
                }
            }
        }
    }
}
