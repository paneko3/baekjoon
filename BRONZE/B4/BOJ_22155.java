// BOJ_22155_Простая задача

import java.io.*;
import java.util.*;

public class BOJ_22155 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if ((a <= 1 && b <= 2) || (a <= 2 && b <= 1)) {
				sb.append("Yes\n");
			}
			else {
				sb.append("No\n");
			}
		}
		/* ==========output========== */
		System.out.print(sb);
		br.close();
	}
}