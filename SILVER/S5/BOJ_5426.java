// BOJ_5426_비밀 편지

import java.io.*;

public class BOJ_5426 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        /* ==========sol========== */
        while (T-- > 0) {
            String encrypted = br.readLine();
            int len = encrypted.length();
            int n = (int) Math.sqrt(len); 
            char[][] square = new char[n][n];
            int idx = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    square[i][j] = encrypted.charAt(idx++);
                }
            }
            for (int j = n - 1; j >= 0; j--) {
                for (int i = 0; i < n; i++) {
                    sb.append(square[i][j]);
                }
            }
            sb.append("\n");
        }
        /* ==========output========== */
        System.out.print(sb);
		br.close();
	}
}