// BOJ_6246_풍선 놀이 

import java.io.*;
import java.util.*;

public class BOJ_6246 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		boolean[] check = new boolean[N+1];
		for(int i=0;i<Q;i++	) {
			st = new StringTokenizer(br.readLine());
			int L = Integer.parseInt(st.nextToken());
			int I = Integer.parseInt(st.nextToken());
			for(int j=L;j<=N;j+=I) {
				check[j]=true;
			}
		}
		int result = 0;
		for(int i=1;i<=N;i++) {
			if(!check[i]) {
				result++;
			}
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}
