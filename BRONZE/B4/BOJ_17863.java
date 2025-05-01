// BOJ_17863_FYI

import java.io.*;

public class BOJ_17863 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        /* ==========sol========== */
        int prefix = n / 10000;

        /* ==========output========== */
        if (prefix == 555) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
		br.close();
	}
}