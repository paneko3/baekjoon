// BOJ_15489_파스칼삼각형

import java.io.*;
import java.util.*;

public class BOJ_15489 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());

		/* ==========sol========== */
		int[][] pascal = new int[31][31];
		for (int i = 1; i <= 30; i++) {
			pascal[i][1] = 1;
			for (int j = 2; j <= i; j++) {
				pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
			}
		}

		int result = 0;
		for (int i = 0; i < W; i++) {
			for (int j = 0; j <= i; j++) {
				result += pascal[R + i][C + j];
			}
		}

		/* ==========output========== */
		System.out.println(result);
	}
}
