// BOJ_31822_재수강

import java.io.*;

public class BOJ_31822 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().substring(0,5);
		int N = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		int result = 0;
		for(int i=0;i<N;i++) {
			String temp = br.readLine().substring(0,5);
			if(str.equals(temp)) {
				result++;
			}
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}
