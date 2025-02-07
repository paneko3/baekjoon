// BOJ_26560_Periods

import java.io.*;

public class BOJ_26560 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			/* ==========input========== */
			String str = br.readLine();
			/* ==========sol========== */
			/* ==========output========== */
			System.out.println(str.charAt(str.length()-1)!='.'?str+".":str);
		}
		br.close();
	}
}
