// BOJ_21665_Миша и негатив

import java.io.*;
import java.util.*;

public class BOJ_21665 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] original = new char[n][m];
        for (int i = 0; i < n; i++) {
            original[i] = br.readLine().toCharArray();
        }
        br.readLine();
        int errorCount = 0;
        /* ==========sol========== */
        for (int i = 0; i < n; i++) {
            char[] negative = br.readLine().toCharArray();
            for (int j = 0; j < m; j++) {
                if ((original[i][j] == 'B' && negative[j] != 'W') || 
                    (original[i][j] == 'W' && negative[j] != 'B')) {
                    errorCount++;
                }
            }
        }
        /* ==========output========== */
        System.out.println(errorCount);
        br.close();
	}
}