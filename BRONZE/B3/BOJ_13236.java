// BOJ_13236_Collatz Conjecture

import java.io.*;

public class BOJ_13236 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();

		/* ==========sol========== */
		StringBuilder sb = new StringBuilder();
		while (n != 1) {
			sb.append(n).append(" ");
			if (n % 2 == 0) {
				n /= 2;
			} else {
				n = 3 * n + 1;
			}
		}
		sb.append(1); // 마지막 숫자 추가 (공백 X)

		/* ==========output========== */
		System.out.println(sb);
	}
}