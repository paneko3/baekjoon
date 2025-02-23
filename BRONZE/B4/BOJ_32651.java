// BOJ_32651_인간은 무엇인가

import java.io.*;

public class BOJ_32651 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		/* ==========sol========== */
		/* ==========output========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println((N<=100000&&N%2024==0)?"Yes":"No");
		br.close();
	}
}
