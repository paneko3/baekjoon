// BOJ_2422_한윤정이 이탈리아에 가서 아이스크림을 사먹는데

import java.io.*;
import java.util.*;

public class BOJ_2422 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        boolean[][] bad = new boolean[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bad[a][b] = bad[b][a] = true;
        }
        /* ==========sol========== */
        int result = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (bad[i][j]) continue;
                for (int k = j + 1; k <= n; k++) {
                    if (bad[i][k] || bad[j][k]) continue;
                    result++;
                }
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
