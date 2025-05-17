// BOJ_30804_과일 탕후루

import java.io.*;
import java.util.*;

public class BOJ_30804 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		/* ==========sol========== */
		int[] count = new int[10];
		int kind = 0, result = 0;
		for (int left = 0, right = 0; right < n; right++) {
			if (count[arr[right]]++ == 0) {
				kind++;
			}
			while (kind > 2) {
				if (--count[arr[left]] == 0) {
					kind--;
				}
				left++;
			}
			result = Math.max(result, right - left + 1);
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}