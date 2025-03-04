// BOJ_3507_Automated Telephone Exchange

import java.io.*;
import java.util.*;

public class BOJ_3507 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		int result = 0;
		for(int i=0;i<=99;i++) {
			for(int j=0;j<=99;j++) {
				if((N-i-j)==0) {
					result++;
				}
			}
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}
