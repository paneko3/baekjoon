// BOJ_1362_펫

import java.io.*;
import java.util.*;

public class BOJ_1362 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int idx = 1;
		while (true) {
			st = new StringTokenizer(br.readLine());
			int o = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			if (o == 0 && w == 0) break;
			boolean dead = false;
			while (true) {
				st = new StringTokenizer(br.readLine());
				String act = st.nextToken();
				int n = Integer.parseInt(st.nextToken());
				if (act.equals("#") && n == 0) break;
				if (dead) continue;
				if (act.equals("E")) w -= n;
				else if (act.equals("F")) w += n;
				if (w <= 0) dead = true;
			}
			/* ==========output========== */
			System.out.print(idx++ + " ");
			if (dead) System.out.println("RIP");
			else if (w > o / 2 && w < o * 2) System.out.println(":-)");
			else System.out.println(":-(");
		}
	}
}
