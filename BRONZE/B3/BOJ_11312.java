// BOJ_11312_삼각 무늬 - 2

import java.io.*;
import java.util.*;

public class BOJ_11312 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for(int t=0;t<T;t++) {
			/* ==========input========== */
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			/* ==========sol========== */
			/* ==========output========== */
			System.out.println((A/B)*(A/B));
		}
		br.close();
	}
}
