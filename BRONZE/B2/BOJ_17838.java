// BOJ_17838_커맨드

import java.io.*;

public class BOJ_17838 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		/* ==========output========== */
		for(int t=0;t<T;t++) {
			String str = br.readLine();
			if(str.length()==7) {
				char A = str.charAt(0);
				char B = str.charAt(2);
				if(A!=B&&A==str.charAt(1)&&A==str.charAt(4)&&B==str.charAt(3)&&B==str.charAt(5)&&B==str.charAt(6)) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
			}else {
				System.out.println(0);
			}
		}
		br.close();
	}
}
