// BOJ_15734_명장 남정훈

import java.io.*;
import java.util.*;

public class BOJ_15734 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int L = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		int A = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		int sum = L + R + A;
		int temp = A - Math.abs(L-R);
		/* ==========output========== */
		System.out.println(temp>=0? sum-temp%2:sum-Math.abs(temp));
		br.close();
	}
}
