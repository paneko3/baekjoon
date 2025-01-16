// BOJ_14651_걷다보니 신천역 삼 (Large)

import java.io.*;

public class BOJ_14651 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[] dp = new long[N+1];
		if(N==1) {
			System.out.println(0);
			return;
		}
		dp[2]=2;
		for(int i=3;i<=N;i++) {
			dp[i]=dp[i-1]*3%1000000009;
		}
		System.out.println(dp[N]);
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}
}
