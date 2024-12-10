// BOJ_7770_아즈텍 피라미드

import java.io.*;

public class BOJ_7770 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int A = 1;
		int B = 1;
		int i = 1;
		while(true) {
			B+=4*i;
			A+=B;
			if(A>N) {
				break;
			}
			i++;
		}
		System.out.println(i);
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}
}
