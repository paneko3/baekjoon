// BOJ_28224_Final Price

import java.io.*;

public class BOJ_28224 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		int result = 0;
		for(int i=0;i<N;i++) {
			result+=Integer.parseInt(br.readLine());
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}
