// BOJ_14716_현수막

import java.io.*;
import java.util.*;

public class BOJ_14716 {
    static int m, n;
    static int[][] arr;
    static boolean[][] check;
    static int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        arr = new int[m][n];
        check = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) { arr[i][j] = Integer.parseInt(st.nextToken()); }
        }
        /* ==========sol========== */
        int result = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1 && !check[i][j]) {
                    dfs(i, j);
                    result++;
                }
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }

    static void dfs(int r, int c) {
        check[r][c] = true;
        for (int i = 0; i < 8; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];
            if (nr >= 0 && nr < m && nc >= 0 && nc < n && arr[nr][nc] == 1 && !check[nr][nc]) {
                dfs(nr, nc);
            }
        }
    }
}
