// BOJ_18698_The Walking Adam

import java.io.*;

public class BOJ_18698 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Loop:for(int i=0;i<N;i++) {
			/* ==========input========== */
			String str = br.readLine();
			/* ==========sol========== */
			for(int j=0;j<str.length();j++) {
				if(str.charAt(j)=='D') {
					System.out.println(j);
					continue Loop;
				}
			}
			/* ==========output========== */
			System.out.println(str.length());
		}
		br.close();
	}
}
