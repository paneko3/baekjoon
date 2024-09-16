// BOJ_17175_피보나치는 지겨웡~

import java.io.*;

public class BOJ_17175 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		int[] dp = new int[N+1];
		if(N==0||N==1) {
			System.out.println(1);
			return;
		}
		dp[0]=1;
		dp[1]=1;
		for(int i=2;i<=N;i++) {
			dp[i]=(dp[i-2]+dp[i-1]+1)%1000000007;
		}
		/* ==========output========== */
		System.out.println(dp[N]);
		br.close();
	}
}
