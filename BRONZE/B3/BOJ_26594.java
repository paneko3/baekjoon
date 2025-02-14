// BOJ_26594_ZOAC 5

import java.io.*;

public class BOJ_26594 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		/* ==========sol========== */
		int result = 1;
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)!=str.charAt(0)) {
				break;
			}
			result++;
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}
