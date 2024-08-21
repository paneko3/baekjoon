// BOJ_14579_덧셈과 곱셈

import java.io.*;
import java.util.*;

public class BOJ_14579 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		int result = 1;
		for(int i=a;i<=b;i++) {
			result *= i*(i+1)/2;
			result %= 14579;
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}
