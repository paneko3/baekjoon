// BOJ_11123_양 한마리... 양 두마리...

import java.io.*;
import java.util.*;

public class BOJ_11123 {
    static int H, W;
    static char[][] map;
    static boolean[][] check;
    static int[] dy = {-1, 1, 0, 0}, dx = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            /* ==========input========== */
            StringTokenizer st = new StringTokenizer(br.readLine());
            H = Integer.parseInt(st.nextToken()); W = Integer.parseInt(st.nextToken());
            map = new char[H][W]; check = new boolean[H][W];
            for (int i = 0; i < H; i++) { map[i] = br.readLine().toCharArray(); }
            /* ==========sol========== */
            int result = 0;
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (map[i][j] == '#' && !check[i][j]) { result++; dfs(i, j); }
                }
            }
            /* ==========output========== */
            System.out.println(result);
        }
        br.close();
    }
    static void dfs(int y, int x) {
        check[y][x] = true;
        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i], nx = x + dx[i];
            if (ny >= 0 && ny < H && nx >= 0 && nx < W && map[ny][nx] == '#' && !check[ny][nx]) { dfs(ny, nx); }
        }
    }
}
