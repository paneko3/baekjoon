// BOJ_20365_블로그2

import java.io.*;
import java.util.*;

public class BOJ_20365 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String s = br.readLine();
		/* ==========sol========== */
		int r = 0, b = 0;
		char prev = ' ';
		for (int i = 0; i < N; i++) {
			char c = s.charAt(i);
			if (c != prev) {
				if (c == 'R') { r++; }
				else { b++; }
			}
			prev = c;
		}
		int result = Math.min(r, b) + 1;
		/* ==========output========== */
		System.out.println(result);
	}
}
