// BOJ_6118_숨바꼭질

import java.io.*;
import java.util.*;

public class BOJ_6118 {
    static int n, m;
    static ArrayList<Integer>[] list;
    static int[] dist;

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        list = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) list[i] = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }
        /* ==========sol========== */
        dist = new int[n + 1];
        Arrays.fill(dist, -1);
        bfs(1);
        int idx = 0;
        int max = 0;
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (dist[i] > max) {
                max = dist[i];
                idx = i;
                cnt = 1;
            } else if (dist[i] == max) {
                cnt++;
            }
        }
        /* ==========output========== */
        System.out.println(idx + " " + max + " " + cnt);
        br.close();
    }

    static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        dist[start] = 0;
        while (!q.isEmpty()) {
            int cur = q.poll();
            for (int next : list[cur]) {
                if (dist[next] == -1) {
                    dist[next] = dist[cur] + 1;
                    q.add(next);
                }
            }
        }
    }
}
