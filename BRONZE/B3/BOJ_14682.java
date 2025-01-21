// BOJ_14682_Shifty Sum

import java.io.*;

public class BOJ_14682 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		int result = 0;
		for(int i=0;i<=k;i++) {
			result += N*Math.pow(10, i);
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}
