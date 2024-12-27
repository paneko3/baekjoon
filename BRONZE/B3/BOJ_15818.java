// BOJ_15818_오버플로우와 모듈러

import java.io.*;
import java.util.*;

public class BOJ_15818 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		long M = Long.parseLong(st.nextToken());
		long result = 1; 
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			result=(result%M)*(Long.parseLong(st.nextToken())%M);
		}
		System.out.println(result%M);
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}
}
