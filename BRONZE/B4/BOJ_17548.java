// BOJ_17548_Greetings!

import java.io.*;

public class BOJ_17548 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		/* ==========sol========== */
		/* ==========output========== */
		System.out.print("h");
		for(int i=1;i<str.length()-1;i++) {
			System.out.print("ee");
		}
		System.out.print("y");
		br.close();
	}
}
