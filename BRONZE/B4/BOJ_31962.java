// BOJ_31962_등교

import java.io.*;
import java.util.*;

public class BOJ_31962 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		int result = -1;
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			int S = Integer.parseInt(st.nextToken());
			int T = Integer.parseInt(st.nextToken());
			if(S+T<=X) {
				result = Math.max(result,S);
			}
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}
