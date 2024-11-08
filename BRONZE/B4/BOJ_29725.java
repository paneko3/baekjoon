// BOJ_29725_체스 초보 브실이

import java.io.*;

public class BOJ_29725 {
	static char[] arrC = {'K', 'k', 'P', 'p', 'N', 'n', 'B', 'b', 'R', 'r', 'Q', 'q'};
	static int[] arrI = {0,0,1,-1,3,-3,3,-3,5,-5,9,-9};
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/* ==========sol========== */
		int result = 0;
		for(int i=0;i<8;i++) {
			String str = br.readLine();
			for(int j=0;j<8;j++) {
				char c = str.charAt(j);
				for(int k=0;k<12;k++) {
					if(c==arrC[k]) {
						result+=arrI[k];
						break;
					}
				}
			}
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}
