// BOJ_21734_SMUPC의 등장

import java.io.*;

public class BOJ_21734 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			int n = c;
			int sum = 0;
			while(n!=0) {
				sum+=(n%10);
				n/=10;
			}
			for(int j=0;j<sum;j++) {
				System.out.print(c);
			}
			System.out.println();
		}
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}
}
