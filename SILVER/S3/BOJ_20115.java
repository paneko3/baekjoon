// BOJ_20115_에너지 드링크

import java.io.*;
import java.util.*;

public class BOJ_20115 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		double[] arr = new double[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
		}
		/* ==========sol========== */
		Arrays.sort(arr);
		double result = arr[n - 1];
		for (int i = 0; i < n - 1; i++) {
			result += arr[i] / 2.0;
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}