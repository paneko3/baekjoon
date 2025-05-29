// BOJ_5692_팩토리얼 진법

import java.io.*;

public class BOJ_5692 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		/* ==========sol========== */
		while (!(s = br.readLine()).equals("0")) {
			int len = s.length();
			int result = 0;
			for (int i = 0; i < len; i++) {
				int digit = s.charAt(i) - '0';
				int fact = 1;
				for (int j = 2; j <= len - i; j++) {
					fact *= j;
				}
				result += digit * fact;
			}
			/* ==========output========== */
			System.out.println(result);
		}
	}
}
