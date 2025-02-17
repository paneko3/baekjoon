// BOJ_23627_driip

import java.io.*;

public class BOJ_23627 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		/* ==========sol========== */
		/* ==========output========== */
		if(str.length()<=4) {
			System.out.println("not cute");
			return;
		}
		System.out.println(str.substring(str.length()-5,str.length()).equals("driip")?"cute":"not cute");
		br.close();
	}
}
