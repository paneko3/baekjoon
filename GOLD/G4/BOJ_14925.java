// BOJ_14925_목장 건설하기

import java.io.*;
import java.util.*;

public class BOJ_14925 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] map = new int[N+1][M+1];
		int[][] dp = new int[N+1][M+1];
		for(int i=1;i<=N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1;j<=M;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		/* ==========sol========== */
		int result = 0;
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=M;j++) {
				if(map[i][j]!=0) {
					dp[i][j]=0;
				}else {
					dp[i][j]=Math.min(dp[i-1][j], Math.min(dp[i][j-1],dp[i-1][j-1]))+1;
				}
				result = Math.max(result, dp[i][j]);
			}
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}