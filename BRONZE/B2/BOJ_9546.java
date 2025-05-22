// BOJ_9546_3000번 버스

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		while (T-- > 0) {
			int k = Integer.parseInt(br.readLine());
			int result = 0;
			for (int i = 0; i < k; i++) {
				result = result * 2 + 1;
			}
			/* ==========output========== */
			System.out.println(result);
		}
	}
}
