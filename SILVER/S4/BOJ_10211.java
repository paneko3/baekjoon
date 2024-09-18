// BOJ_10211_Maximum Subarray

import java.io.*;
import java.util.*;

public class BOJ_10211 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for(int t=0;t<T;t++) {
			int N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			int[] arr = new int[N+1];
			for(int i=1;i<=N;i++) {
				arr[i]=Integer.parseInt(st.nextToken());
			}
			/* ==========sol========== */
			int[] dp = new int[N+1];
			dp[1]=arr[1];
			int max = arr[1];
			for(int i=2;i<=N;i++) {
				if(dp[i-1]<0) {
					dp[i-1]=0;
				}
				dp[i]=dp[i-1]+arr[i];
				max=Math.max(max, dp[i]);
			}
			/* ==========output========== */
			System.out.println(max);
		}
		br.close();
	}
}
