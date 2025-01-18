// BOJ_13225_Divisors 

import java.io.*;

public class BOJ_13225 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine());
		for(int c=0;c<C;c++) {
			/* ==========input========== */
			int n = Integer.parseInt(br.readLine());
			/* ==========sol========== */
			int count = 0;
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					count++;
				}
			}
			/* ==========output========== */
			System.out.println(n + " " + count);
		}
		br.close();
	}
}
