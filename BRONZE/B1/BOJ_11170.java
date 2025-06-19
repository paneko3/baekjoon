// BOJ_11170_0의개수

import java.io.*;
import java.util.*;

public class BOJ_11170 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		/* ==========sol========== */
		while (T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), count = 0;
			for (int i = N; i <= M; i++) {
				int n = i;
				if (n == 0) count++;
				while (n > 0) {
					if (n % 10 == 0) count++;
					n /= 10;
				}
			}
			sb.append(count).append("\n");
		}
		/* ==========output========== */
		System.out.print(sb);
	}
}
