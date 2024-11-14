// BOJ_15881_Pen Pineapple Apple Pen

import java.io.*;

public class BOJ_15881 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		/* ==========sol========== */
		str = str.replaceAll("pPAp", "");
		/* ==========output========== */
		System.out.println((N-str.length())/4);
		br.close();
	}
}
