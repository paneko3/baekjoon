// BOJ_1246_온라인 판매

import java.io.*;
import java.util.*;

public class BOJ_1246 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[M];
		for (int i = 0; i < M; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		/* ==========sol========== */
		Arrays.sort(arr);
		int result = 0, price = 0;
		for (int i = 0; i < M; i++) {
			int cnt = Math.min(N, M - i);
			int rev = arr[i] * cnt;
			if (rev > result) {
				result = rev;
				price = arr[i];
			}
		}
		/* ==========output========== */
		System.out.println(price + " " + result);
	}
}
