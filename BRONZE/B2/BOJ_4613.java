// BOJ_4613_Quicksum

import java.io.*;

public class BOJ_4613 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String str = br.readLine();
			if(str.equals("#")) {
				break;
			}
			int result = 0;
			for(int i=0;i<str.length();i++) {
				char c = str.charAt(i);
				if(c==' ') {
					continue;
				}
				result+=(i+1)*(c-'A'+1);
			}
			System.out.println(result);
		}
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}
}
