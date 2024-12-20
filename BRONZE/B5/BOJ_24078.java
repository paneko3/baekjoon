// BOJ_24078_余り (Remainder)

import java.io.*;

public class BOJ_24078 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		/* ==========output========== */
		System.out.println(X%21);
		br.close();
	}
}
