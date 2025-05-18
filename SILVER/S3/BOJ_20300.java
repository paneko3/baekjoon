// BOJ_20300_서강근육맨

import java.io.*;
import java.util.*;

public class BOJ_20300 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Long[] arr = new Long[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) arr[i] = Long.parseLong(st.nextToken());
		/* ==========sol========== */
		Arrays.sort(arr);
		long result = 0;
		if (n % 2 == 1) {
			result = arr[n - 1];
			n--;
		}
		for (int i = 0; i < n / 2; i++) {
			result = Math.max(result, arr[i] + arr[n - 1 - i]);
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}
