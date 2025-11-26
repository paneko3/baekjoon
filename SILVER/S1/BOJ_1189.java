// BOJ_1189_컴백홈

import java.io.*;
import java.util.*;

public class BOJ_1189 {
    static int R, C, K;
    static char[][] map;
    static boolean[][] visited;
    static int count = 0;

    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        map = new char[R][C];
        for (int i = 0; i < R; i++) {
            String line = br.readLine();
            map[i] = line.toCharArray();
        }

        /* ==========sol========== */
        
        visited = new boolean[R][C];
        dfs(R - 1, 0, 1);
        
        /* ==========output========== */
        System.out.println(count);
        br.close();
    }

    private static void dfs(int r, int c, int dist) {
        if (r == 0 && c == C - 1) {
            if (dist == K) {
                count++;
            }
            return;
        }

        if (dist >= K) {
            return;
        }

        visited[r][c] = true;

        for (int i = 0; i < 4; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];

            if (nr < 0 || nr >= R || nc < 0 || nc >= C) {
                continue;
            }

            if (!visited[nr][nc] && map[nr][nc] != 'T') {
                dfs(nr, nc, dist + 1);
            }
        }

        visited[r][c] = false;
    }
}
