// BOJ_1392_노래 악보

import java.io.*;
import java.util.*;

public class BOJ_1392 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		int[] time = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			time[i] = time[i - 1] + Integer.parseInt(br.readLine());
		}
		StringBuilder sb = new StringBuilder();
		/* ==========sol========== */
		for (int i = 0; i < Q; i++) {
			int t = Integer.parseInt(br.readLine());
			int l = 1;
			int r = N;
			int ans = 0;
			while (l <= r) {
				int m = (l + r) / 2;
				if (time[m] > t) {
					ans = m;
					r = m - 1;
				} else {
					l = m + 1;
				}
			}
			/* ==========output========== */
			sb.append(ans).append("\n");
		}
		System.out.print(sb);
	}
}
