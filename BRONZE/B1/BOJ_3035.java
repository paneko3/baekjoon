// BOJ_3035_스캐너

import java.io.*;
import java.util.*;

public class BOJ_3035 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int zr = Integer.parseInt(st.nextToken());
        int zc = Integer.parseInt(st.nextToken());
        
        char[][] news = new char[r][c];
        for (int i = 0; i < r; i++) {
            String line = br.readLine();
            for (int j = 0; j < c; j++) {
                news[i][j] = line.charAt(j);
            }
        }
        /* ==========sol========== */
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < r; i++) {
            for (int k = 0; k < zr; k++) {
                for (int j = 0; j < c; j++) {
                    for (int l = 0; l < zc; l++) {
                        result.append(news[i][j]);
                    }
                }
                result.append("\n");
            }
        }
        /* ==========output========== */
        System.out.print(result);
        br.close();
    }
}
