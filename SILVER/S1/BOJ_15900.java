// BOJ_15900_나무 탈출

import java.io.*;
import java.util.*;

public class BOJ_15900 {
    static List<Integer>[] adj;
    static int n;
    static long totalDepth = 0;

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        adj = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adj[u].add(v);
            adj[v].add(u);
        }

        /* ==========sol========== */
        dfs(1, 0, 0);

        /* ==========output========== */
        if (totalDepth % 2 == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        br.close();
    }

    private static void dfs(int cur, int prev, int depth) {
        boolean isLeaf = true;

        for (int next : adj[cur]) {
            if (next != prev) {
                isLeaf = false;
                dfs(next, cur, depth + 1);
            }
        }

        if (isLeaf && cur != 1) {
            totalDepth += depth;
        }
    }
}
