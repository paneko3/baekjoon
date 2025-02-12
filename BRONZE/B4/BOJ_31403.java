// BOJ_31403_A + B - C

import java.io.*;

public class BOJ_31403 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		/* ==========output========== */
		System.out.println(A+B-C);
		if (B < 10) {
			System.out.println(10*A+B-C);
		}
	    else if (B < 100) {
			System.out.println(100*A+B-C);
		}
	    else if (B < 1000) {
			System.out.println(1000*A+B-C);
		}
	    else {
			System.out.println(10000*A+B-C);
		}
		br.close();
	}
}
