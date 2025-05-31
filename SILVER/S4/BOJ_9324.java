// BOJ_9324_진짜 메시지

import java.io.*;

public class BOJ_9324 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		while (T-- > 0) {
			String s = br.readLine();
			int[] count = new int[26];
			boolean fake = false;
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				count[c - 'A']++;
				if (count[c - 'A'] == 3) {
					if (i + 1 >= s.length() || s.charAt(i + 1) != c) {
						fake = true;
						break;
					}
					count[c - 'A'] = 0;
					i++; // 반복된 문자 스킵
				}
			}
			/* ==========output========== */
			System.out.println(fake ? "FAKE" : "OK");
		}
	}
}
