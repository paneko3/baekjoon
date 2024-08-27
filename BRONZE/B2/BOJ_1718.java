// BOJ_1718_암호

import java.io.*;

public class BOJ_1718 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String key = br.readLine();
		/* ==========sol========== */
		/* ==========output========== */
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			int k = key.charAt(i%key.length())-'a'+1;
			if(c==' ') {
				System.out.print(" ");
				continue;
			}
			System.out.print((char)(c-k<'a'?c-k+26:c-k));
		}
		br.close();
	}
}
