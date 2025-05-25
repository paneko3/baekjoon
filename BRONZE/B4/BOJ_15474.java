// BOJ_15474_鉛筆 (Pencils)

import java.io.*;
import java.util.*;

public class BOJ_15474 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		int x = ((N + A - 1) / A) * B;
		int y = ((N + C - 1) / C) * D;
		int result = Math.min(x, y);
		/* ==========output========== */
		System.out.println(result);
	}
}
