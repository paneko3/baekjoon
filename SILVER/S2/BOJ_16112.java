// BOJ_16112_5차 전직

import java.io.*;
import java.util.*;

public class BOJ_16112 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		Arrays.sort(arr);
		long result = 0;
		int activate = 0;
		for (int i = 0; i < n; i++) {
			result += (long) arr[i] * activate;
			if (activate < k) activate++;
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}