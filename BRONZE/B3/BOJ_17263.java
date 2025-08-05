// BOJ_17263_Sort 마스터 배지훈

import java.io.*;
import java.util.*;

public class BOJ_17263 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		/* ==========sol========== */
		int result = 0;
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			if (num > result) {
				result = num;
			}
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}
