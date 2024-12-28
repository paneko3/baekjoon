// BOJ_26546_Reverse

import java.io.*;
import java.util.*;

public class BOJ_26546 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for(int t=0;t<T;t++) {
			/* ==========input========== */
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			/* ==========sol========== */
			for(int k=0;k<str.length();k++) {
				if(k>=i&&k<j) {
					continue;
				}
				System.out.print(str.charAt(k));
			}
			/* ==========output========== */
			System.out.println();
		}
		br.close();
	}
}
