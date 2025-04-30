// BOJ_4696_St. Ives

import java.io.*;

public class BOJ_4696 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        /* ==========sol========== */
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            double n = Double.parseDouble(line);
            if (n == 0.0) break;
            double total = 1 + n + Math.pow(n, 2) + Math.pow(n, 3) + Math.pow(n, 4);
            /* ==========output========== */
            sb.append(String.format("%.2f", total)).append("\n");
        }
        System.out.print(sb);
		br.close();
	}
}