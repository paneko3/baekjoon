// BOJ_16439_치킨치킨치킨

import java.io.*;
import java.util.*;

public class BOJ_16439 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] arr = new int[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		/* ==========sol========== */
		int result = 0;
		for (int i = 0; i < M; i++) {
			for (int j = i; j < M; j++) {
				for (int k = j; k < M; k++) {
					int sum = 0;
					for (int n = 0; n < N; n++) {
						int max = Math.max(arr[n][i], Math.max(arr[n][j], arr[n][k]));
						sum += max;
					}
					result = Math.max(result, sum);
				}
			}
		}
		/* ==========output========== */
		System.out.println(result);
	}
}
