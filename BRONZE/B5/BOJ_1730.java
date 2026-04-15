// BOJ_1730_판화

import java.util.Scanner;

public class BOJ_1730 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        String commands = sc.hasNext() ? sc.next() : "";

      
        boolean[][] vertical = new boolean[n][n];
        boolean[][] horizontal = new boolean[n][n];

        /* ==========sol========== */
        int r = 0, c = 0;
        for (int i = 0; i < commands.length(); i++) {
            char cmd = commands.charAt(i);
            int nr = r, nc = c;

            if (cmd == 'U') nr--;
            else if (cmd == 'D') nr++;
            else if (cmd == 'L') nc--;
            else if (cmd == 'R') nc++;

          
            if (nr < 0 || nr >= n || nc < 0 || nc >= n) continue;

          
            if (cmd == 'U' || cmd == 'D') {
                vertical[r][c] = true;
                vertical[nr][nc] = true;
            } else {
                horizontal[r][c] = true;
                horizontal[nr][nc] = true;
            }

            // 위치 업데이트
            r = nr;
            c = nc;
        }

        /* ==========output========== */
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (vertical[i][j] && horizontal[i][j]) sb.append('+');
                else if (vertical[i][j]) sb.append('|');
                else if (horizontal[i][j]) sb.append('-');
                else sb.append('.');
            }
            sb.append('\n');
        }
        System.out.print(sb);
        sc.close();
    }
}
