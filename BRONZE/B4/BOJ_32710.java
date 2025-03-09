// BOJ_32710_구구단표

import java.io.*;

public class BOJ_32710 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		boolean[] check = new boolean[101];
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				check[i*j]=true;
			}
		}
		/* ==========output========== */
		System.out.println(check[N]?1:0);
		br.close();
	}
}
