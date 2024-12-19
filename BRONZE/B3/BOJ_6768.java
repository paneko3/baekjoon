// BOJ_6768_Don’t pass me the ball!

import java.io.*;

public class BOJ_6768 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		/* ==========output========== */
		System.out.println((N-1)*(N-2)*(N-3)/6);
		br.close();
	}
}
