// BOJ_14496_그대, 그머가 되어

import java.util.*;

public class BOJ_14496 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        int start = sc.nextInt();
        int end = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer>[] adj = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj[u].add(v);
            adj[v].add(u);
        }

        /* ==========sol========== */
        int[] dist = new int[n + 1];
        Arrays.fill(dist, -1);
        Queue<Integer> q = new LinkedList<>();

        q.offer(start);
        dist[start] = 0;

        while (!q.isEmpty()) {
            int curr = q.poll();

            if (curr == end) break;

            for (int next : adj[curr]) {
                if (dist[next] == -1) {
                    dist[next] = dist[curr] + 1;
                    q.offer(next);
                }
            }
        }

        /* ==========output========== */
        System.out.println(dist[end]);
        sc.close();
    }
}
