// BOJ_24072_帰省 (Homecoming)

import java.io.*;
import java.util.*;

public class BOJ_24072 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		/* ==========output========== */
		System.out.println(A<=C&&B>C?1:0);
		br.close();
	}
}
