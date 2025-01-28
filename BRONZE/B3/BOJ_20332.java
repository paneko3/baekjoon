// BOJ_20332_Divvying Up

import java.io.*;
import java.util.*;

public class BOJ_20332 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		int sum = 0;
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			sum+=Integer.parseInt(st.nextToken());
		}
		/* ==========output========== */
		System.out.println(sum%n==0?"yes":"no");
		br.close();
	}
}
