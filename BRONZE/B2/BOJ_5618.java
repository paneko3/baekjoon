// BOJ_5618_공약수

import java.io.*;
import java.util.*;

public class BOJ_5618 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

		/* ==========sol========== */
		int g = arr[0];
		for (int i = 1; i < n; i++) g = gcd(g, arr[i]);
		
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= g; i++) if (g % i == 0) sb.append(i).append('\n');

		/* ==========output========== */
		System.out.print(sb);
	}
	
	static int gcd(int a, int b) {
		while (b != 0) {
			int t = a % b;
			a = b;
			b = t;
		}
		return a;
	}
}
