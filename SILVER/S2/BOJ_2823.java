// BOJ_2823_유턴 싫어

import java.util.Scanner;

public class BOJ_2823 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        int r = sc.nextInt();
        int c = sc.nextInt();
        char[][] map = new char[r][c];

        for (int i = 0; i < r; i++) {
            map[i] = sc.next().toCharArray();
        }

        /* ==========sol========== */
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        int result = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (map[i][j] == '.') {
                    int count = 0;
                    for (int d = 0; d < 4; d++) {
                        int ni = i + dx[d];
                        int nj = j + dy[d];

                        if (ni >= 0 && ni < r && nj >= 0 && nj < c) {
                            if (map[ni][nj] == '.') {
                                count++;
                            }
                        }
                    }

                    if (count <= 1) {
                        result = 1;
                        break;
                    }
                }
            }
            if (result == 1) break;
        }

        /* ==========output========== */
        System.out.println(result);
        sc.close();
    }
}
