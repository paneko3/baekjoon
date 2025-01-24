// BOJ_14614_Calculate!

import java.io.*;
import java.util.*;

public class BOJ_14614 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		String C = st.nextToken();
		/* ==========sol========== */
		/* ==========output========== */
		if((C.charAt(C.length()-1)-'0')%2==0) {
			System.out.println(A);
		}else {
			System.out.println(A^B);
		}
		br.close();
	}
}
