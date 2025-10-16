// BOJ_10157_자리배정

import java.io.*;
import java.util.*;

public class BOJ_10157 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int C = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        int K = Integer.parseInt(br.readLine());

        /* ==========sol========== */
        if (K > C * R) {
            System.out.println(0);
            return;
        }

        int dx[] = {-1, 0, 1, 0};
        int dy[] = {0, 1, 0, -1};

        boolean[][] visit = new boolean[R][C];

        int cnt = 0, x = R - 1, y = 0, dir = 0;
        while (++cnt != K) {
            visit[x][y] = true;
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx < 0 || ny < 0 || nx >= R || ny >= C || visit[nx][ny]) {
                dir = ++dir % 4;
                nx = x + dx[dir];
                ny = y + dy[dir];
            }

            x = nx;
            y = ny;
        }

        /* ==========output========== */
        System.out.println((y + 1) + " " + (R - x));
    }
}
