// BOJ_28417_스케이트보드

import java.io.*;
import java.util.*;

public class BOJ_28417 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int result = 0;
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int[] arr = new int[5];
			for(int j=0;j<5;j++) {
				arr[j]=Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			int score = 0;
			score += Math.max(a, b);
			score += arr[3]+arr[4];
			result = Math.max(result, score);
		}
		System.out.println(result);
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}
}
