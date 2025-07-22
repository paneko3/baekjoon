// BOJ_1996_지뢰 찾기

import java.io.*;

public class BOJ_1996 {
    static int N;
    static char[][] map;
    static int[][] result;
    static int[] dx = {-1,-1,-1,0,0,1,1,1};
    static int[] dy = {-1,0,1,-1,1,-1,0,1};

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new char[N][N];
        result = new int[N][N];
        for (int i = 0; i < N; i++) {
            map[i] = br.readLine().toCharArray();
        }

        /* ==========sol========== */
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (Character.isDigit(map[i][j])) {
                    int mine = map[i][j] - '0';
                    for (int d = 0; d < 8; d++) {
                        int ni = i + dx[d];
                        int nj = j + dy[d];
                        if (ni >= 0 && ni < N && nj >= 0 && nj < N && map[ni][nj] == '.') {
                            result[ni][nj] += mine;
                        }
                    }
                }
            }
        }

        /* ==========output========== */
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (Character.isDigit(map[i][j])) {
                    sb.append('*');
                } else if (result[i][j] >= 10) {
                    sb.append('M');
                } else {
                    sb.append(result[i][j]);
                }
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}
