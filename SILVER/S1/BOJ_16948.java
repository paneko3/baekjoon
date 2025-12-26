// BOJ_16948_데스 나이트

import java.io.*;
import java.util.*;

public class BOJ_16948 {
    static int n, r2, c2;
    static int[] dr = {-2, -2, 0, 0, 2, 2};
    static int[] dc = {-1, 1, -2, 2, -1, 1};
    static int[][] dist;

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r1 = Integer.parseInt(st.nextToken());
        int c1 = Integer.parseInt(st.nextToken());
        r2 = Integer.parseInt(st.nextToken());
        c2 = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        dist = new int[n][n];
        for (int i = 0; i < n; i++) { Arrays.fill(dist[i], -1); }
        bfs(r1, c1);
        /* ==========output========== */
        System.out.println(dist[r2][c2]);
        br.close();
    }

    static void bfs(int r, int c) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{r, c});
        dist[r][c] = 0;
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            if (cur[0] == r2 && cur[1] == c2) { return; }
            for (int i = 0; i < 6; i++) {
                int nr = cur[0] + dr[i];
                int nc = cur[1] + dc[i];
                if (nr >= 0 && nr < n && nc >= 0 && nc < n && dist[nr][nc] == -1) {
                    dist[nr][nc] = dist[cur[0]][cur[1]] + 1;
                    q.add(new int[]{nr, nc});
                }
            }
        }
    }
}
