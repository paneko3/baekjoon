// BOJ_4564_숫자 카드놀이

import java.io.*;

public class BOJ_4564 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/* ==========input========== */
		/* ==========sol========== */
		/* ==========output========== */
		while(true) {
			String S = br.readLine();
			if(S.equals("0")) {
				break;
			}
			while(true) {
				if(Integer.parseInt(S)>=10) {
					System.out.print(S+" ");
				}
				int n = S.charAt(0)-'0';
				for(int i=1;i<S.length();i++) {
					n*=S.charAt(i)-'0';
				}
				if(n<10) {
					System.out.print(n+" ");
					break;
				}
				S = String.valueOf(n);
			}
			
			System.out.println();
		}
		br.close();
	}
}
