// BOJ_11134_쿠키애호가

import java.io.*;
import java.util.*;

public class BOJ_11134 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		/* ==========sol========== */
		/* ==========output========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for(int t=0;t<T;t++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			System.out.println(N%C==0?N/C:N/C+1);
		}
		br.close();
	}
}
