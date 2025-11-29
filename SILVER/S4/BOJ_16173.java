// BOJ_16173_점프왕 쩰리 (Small)

import java.io.*;
import java.util.*;

public class BOJ_16173 {
    static int N;
    static int[][] map;
    static boolean[][] visited;
    static boolean canReach = false;

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        /* ==========sol========== */
        visited = new boolean[N][N];
        dfs(0, 0);

        /* ==========output========== */
        if (canReach) {
            System.out.println("HaruHaru");
        } else {
            System.out.println("Hing");
        }
        br.close();
    }

    private static void dfs(int r, int c) {
        if (canReach) {
            return;
        }

        if (r < 0 || r >= N || c < 0 || c >= N) {
            return;
        }

        if (visited[r][c]) {
            return;
        }

        if (map[r][c] == -1) {
            canReach = true;
            return;
        }

        visited[r][c] = true;
        
        int jump = map[r][c];
        
        dfs(r, c + jump);
        
        dfs(r + jump, c);
    }
}
