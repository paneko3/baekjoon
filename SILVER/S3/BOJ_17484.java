// BOJ_17484_진우의 달 여행 (Small)

import java.io.*;
import java.util.*;

public class BOJ_17484 {
    static int n, m;
    static int[][] map;
    static int result = Integer.MAX_VALUE;
    static int[] dc = {-1, 0, 1}; // 왼쪽 아래, 아래, 오른쪽 아래

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        /* ==========sol========== */
        for (int j = 0; j < m; j++) {
            dfs(0, j, -1, map[0][j]);
        }

        /* ==========output========== */
        System.out.println(result);
        br.close();
    }

    static void dfs(int r, int c, int dir, int sum) {
        if (r == n - 1) {
            result = Math.min(result, sum);
            return;
        }

        for (int i = 0; i < 3; i++) {
            if (dir == i) continue; // 연속해서 같은 방향으로 이동 불가
            int nr = r + 1;
            int nc = c + dc[i];
            if (nc >= 0 && nc < m) {
                dfs(nr, nc, i, sum + map[nr][nc]);
            }
        }
    }
}
