// BOJ_5637_가장 긴 단어

import java.io.*;

public class BOJ_5637 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/* ==========sol========== */
		String longest = "";
		StringBuilder sb = new StringBuilder();
		int ch;
		while ((ch = br.read()) != -1) {
			char c = (char) ch;

			if (Character.isLetter(c) || c == '-') {
				sb.append(c);
			} else {
				if (sb.length() > 0) {
					String word = sb.toString();
					if (word.equals("E-N-D")) break;
					if (word.length() > longest.length()) {
						longest = word;
					}
					sb.setLength(0);
				}
			}
		}
		/* ==========output========== */
		System.out.println(longest.toLowerCase());
		br.close();
	}
}