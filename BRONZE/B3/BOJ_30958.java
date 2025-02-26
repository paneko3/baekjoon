// BOJ_30958_서울사이버대학을 다니고

import java.io.*;

public class BOJ_30958 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		/* ==========sol========== */
		int[] count = new int[26];
		int result = 0;
		for(int i=0;i<N;i++) {
			char c = str.charAt(i);
			if(c>='a'&&c<='z') {
				count[c-'a']++;
				result = Math.max(result, count[c-'a']);
			}
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}
