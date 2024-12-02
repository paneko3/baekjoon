// BOJ_11070_피타고라스 기댓값

import java.io.*;
import java.util.*;

public class BOJ_11070 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for(int t=0;t<T;t++) {
			/* ==========input========== */
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int[] S = new int[n+1];
			int[] A = new int[n+1];
			for(int i=0;i<m;i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				int p = Integer.parseInt(st.nextToken());
				int q = Integer.parseInt(st.nextToken());
				S[a]+=p;
				S[b]+=q;
				A[a]+=q;
				A[b]+=p;
			}
			/* ==========sol========== */
			int max=0;
			int min=1000;
			for(int i=1;i<=n;i++) {
				if(A[i]==0&&S[i]==0) {
					max=Math.max(max,0);
					min=Math.min(min,0);
					continue;
				}
				max=Math.max(max, 1000*S[i]*S[i]/(S[i]*S[i]+A[i]*A[i]));
				min=Math.min(min, 1000*S[i]*S[i]/(S[i]*S[i]+A[i]*A[i]));
			}
			/* ==========output========== */
			System.out.println(max);
			System.out.println(min);
		}
		br.close();
	}
}
