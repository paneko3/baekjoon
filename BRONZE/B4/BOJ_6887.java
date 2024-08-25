// BOJ_6887_Squares

import java.io.*;

public class BOJ_6887 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		/* ==========output========== */
		System.out.println("The largest square has side length " + (int)(Math.sqrt(N)) +".");
		br.close();
	}
}
