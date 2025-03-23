// BOJ_24510_시간복잡도를 배운 도도

import java.io.*;

public class BOJ_24510 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		int result = 0;
		for(int c=0;c<C;c++) {
			String str = br.readLine();
			str = str.replaceAll("for", ".");
			str = str.replaceAll("while", ".");
			int count = 0;
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)=='.') {
					count++;
				}
			}
			result = Math.max(result, count);
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}