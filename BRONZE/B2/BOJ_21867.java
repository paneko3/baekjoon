// BOJ_21867_Java Bitecode

import java.io.*;

public class BOJ_21867 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		/* ==========sol========== */
		for(int i=0;i<N;i++) {
			char c = str.charAt(i);
			if(c=='J'||c=='A'||c=='V') {
				continue;
			}
			sb.append(c);
		}
		/* ==========output========== */
		System.out.println(sb.length()==0?"nojava":sb);
		br.close();
	}
}
