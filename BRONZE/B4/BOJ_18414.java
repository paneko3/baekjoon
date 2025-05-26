// BOJ_18414_X に最も近い値 (The Nearest Value)

import java.io.*;
import java.util.*;

public class BOJ_18414 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int X = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		int result = L;
		for (int i = L + 1; i <= R; i++) {
			if (Math.abs(X - i) < Math.abs(X - result)) {
				result = i;
			}
		}
		/* ==========output========== */
		System.out.println(result);
	}
}
