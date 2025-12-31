// BOJ_16956_늑대와 양

import java.io.*;
import java.util.*;

public class BOJ_16956 {
    static int r, c;
    static char[][] map;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        map = new char[r][c];
        boolean check = true;
        
        for (int i = 0; i < r; i++) {
            String str = br.readLine();
            for (int j = 0; j < c; j++) {
                map[i][j] = str.charAt(j);
            }
        }

        /* ==========sol========== */
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (map[i][j] == 'W') {
                    for (int k = 0; k < 4; k++) {
                        int nr = i + dr[k];
                        int nc = j + dc[k];
                        if (nr >= 0 && nr < r && nc >= 0 && nc < c) {
                            if (map[nr][nc] == 'S') {
                                check = false; // 늑대 바로 옆에 양이 있으면 불가능
                            }
                        }
                    }
                } else if (map[i][j] == '.') {
                    map[i][j] = 'D'; // 빈 칸은 모두 울타리로 채움
                }
            }
        }

        /* ==========output========== */
        if (check) {
            System.out.println(1);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < r; i++) {
                sb.append(map[i]).append('\n');
            }
            System.out.print(sb);
        } else {
            System.out.println(0);
        }
        br.close();
    }
}
