// BOJ_2567_색종이 - 2

import java.io.*;
import java.util.*;

public class BOJ_2567 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[][] grid = new int[100][100];

        for (int k = 0; k < N; k++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            for (int r = y; r < y + 10; r++) {
                for (int c = x; c < x + 10; c++) {
                    grid[r][c] = 1;
                }
            }
        }

        /* ==========sol========== */
        
        int perimeter = 0;
        int[] dr = {0, 0, 1, -1};
        int[] dc = {1, -1, 0, 0};

        for (int r = 0; r < 100; r++) {
            for (int c = 0; c < 100; c++) {
                if (grid[r][c] == 1) {
                    for (int i = 0; i < 4; i++) {
                        int nr = r + dr[i];
                        int nc = c + dc[i];
                        
                        boolean isBoundary = false;
                        
                        if (nr < 0 || nr >= 100 || nc < 0 || nc >= 100) {
                            isBoundary = true;
                        } 
                        else if (grid[nr][nc] == 0) {
                            isBoundary = true;
                        }
                        
                        if (isBoundary) {
                            perimeter++;
                        }
                    }
                }
            }
        }
        
        /* ==========output========== */
        System.out.println(perimeter);
        br.close();
    }
}
