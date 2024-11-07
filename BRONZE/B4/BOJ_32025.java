// BOJ_32025_체육은 수학과목 입니다

import java.io.*;

public class BOJ_32025 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int H = Integer.parseInt(br.readLine());
		int W = Integer.parseInt(br.readLine());
		System.out.println(Math.min(H, W)*50);
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}
}
