// BOJ_18198_Basketball One-on-One

import java.io.*;

public class BOJ_18198 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int a = 0;
		int b = 0;
		for(int i=0;i<str.length();i+=2) {
			char c = str.charAt(i);
			int n = str.charAt(i+1)-'0';
			if(c=='A') {
				a+=n;
			}else {
				b+=n;
			}
			System.out.println(a + " : " + b);
		}
		
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}
}
