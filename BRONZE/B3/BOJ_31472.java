// BOJ_31472_갈래의 색종이 자르기

import java.io.*;

public class BOJ_31472 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println((int)(Math.sqrt(N*2))*4);
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}
}
