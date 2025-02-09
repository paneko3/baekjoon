// BOJ_26645_성장의 비약 선택권

import java.io.*;

public class BOJ_26645 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		/* ==========sol========== */
		/* ==========output========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(N<206?1:(N<218?2:(N<229?3:4)));
		br.close();
	}
}
