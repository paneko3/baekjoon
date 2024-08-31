// BOJ_29766_DKSH 찾기

import java.io.*;

public class BOJ_29766 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		/* ==========sol========== */
		int result = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='D'&&i+3<str.length()) {
				if(str.charAt(i+1)=='K'&&str.charAt(i+2)=='S'&&str.charAt(i+3)=='H') {
					result++;
					i+=3;
					continue;
				}
			}
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}
