// BOJ_13565_침투

import java.io.*;
import java.util.*;

public class BOJ_13565 {
    static int m, n;
    static int[][] map;
    static boolean[][] visited;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static boolean result = false;

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        map = new int[m][n];
        visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            String line = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        /* ==========sol========== */
        for (int j = 0; j < n; j++) {
            if (map[0][j] == 0 && !visited[0][j]) {
                dfs(0, j);
            }
            if (result) break;
        }

        /* ==========output========== */
        System.out.println(result ? "YES" : "NO");
        br.close();
    }

    static void dfs(int r, int c) {
        if (r == m - 1) {
            result = true;
            return;
        }

        visited[r][c] = true;
        for (int i = 0; i < 4; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];

            if (nr >= 0 && nr < m && nc >= 0 && nc < n) {
                if (map[nr][nc] == 0 && !visited[nr][nc]) {
                    dfs(nr, nc);
                    if (result) return;
                }
            }
        }
    }
}
