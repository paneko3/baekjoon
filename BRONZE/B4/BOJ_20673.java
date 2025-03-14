// BOJ_20673_Covid-19

import java.io.*;

public class BOJ_20673 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int p = Integer.parseInt(br.readLine());
		int q = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		/* ==========output========== */
		if(p<=50&&q<=10) {
			System.out.println("White");
		}else if(q>30) {
			System.out.println("Red");
		}else {
			System.out.println("Yellow");
		}
		br.close();
	}
}
