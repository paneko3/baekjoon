// BOJ_25630_팰린드롬 소떡소떡

import java.io.*;

public class BOJ_25630 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		/* ==========sol========== */
		int result = 0;
		for(int i=0;i<N/2;i++) {
			if(str.charAt(i)!=str.charAt(N-1-i)) {
				result++;
			}
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}
