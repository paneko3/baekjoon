// BOJ_18290_NM과 K (1)

import java.util.Scanner;

public class  BOJ_18290 {
    static int N, M, K, maxSum = -40001;
    static int[][] board;
    static boolean[][] visited;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        N = sc.nextInt();
        M = sc.nextInt();
        K = sc.nextInt();
        board = new int[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        /* ==========sol========== */
        dfs(0, 0, 0);
        /* ==========output========== */
        System.out.println(maxSum);
        sc.close();
    }

    static void dfs(int idx, int cnt, int sum) {
        if (cnt == K) {
            maxSum = Math.max(maxSum, sum);
            return;
        }

        for (int i = idx; i < N * M; i++) {
            int r = i / M;
            int c = i % M;

            if (visited[r][c]) continue;

            boolean canSelect = true;
            for (int d = 0; d < 4; d++) {
                int nr = r + dr[d];
                int nc = c + dc[d];
                if (nr >= 0 && nr < N && nc >= 0 && nc < M && visited[nr][nc]) {
                    canSelect = false;
                    break;
                }
            }

            if (canSelect) {
                visited[r][c] = true;
                dfs(i + 1, cnt + 1, sum + board[r][c]);
                visited[r][c] = false;
            }
        }
    }
}
