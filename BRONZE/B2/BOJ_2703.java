// BOJ_2703_Cryptoquote

import java.io.*;

public class BOJ_2703 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int t=0;t<T;t++) {
			/* ==========input========== */
			String str = br.readLine();
			String rule = br.readLine();
			/* ==========sol========== */
			/* ==========output========== */
			for(int i=0;i<str.length();i++) {
				char c = str.charAt(i);
				if(c>='A'&&c<='Z') {
					System.out.print(rule.charAt(c-'A'));
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		br.close();
	}
}
