// BOJ_1059_좋은구간

import java.io.*;
import java.util.*;

/* ==========input========== */
public class BOJ_1059 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[L];
		for (int i = 0; i < L; i++) arr[i] = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(br.readLine());

		/* ==========sol========== */
		Arrays.sort(arr);
		int low = 1, high = 1000;
		for (int i = 0; i < L; i++) {
			if (arr[i] == n) {
				System.out.println(0); return;
			} else if (arr[i] > n) {
				high = arr[i] - 1;
				low = i == 0 ? 1 : arr[i - 1] + 1;
				break;
			}
		}

		int result = 0;
		for (int a = low; a <= n; a++) for (int b = n; b <= high; b++) if (a < b) result++;

		/* ==========output========== */
		System.out.println(result);
	}
}
