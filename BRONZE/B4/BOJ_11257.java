// BOJ_11257_IT Passport Examination

import java.io.*;
import java.util.*;

public class BOJ_11257 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		for(int i=0;i<N;i++) {
			/* ==========input========== */
			st = new StringTokenizer(br.readLine());
			String num = st.nextToken();
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			/* ==========sol========== */
			/* ==========output========== */
			if(a+b+c>=55&&a>=11&&b>=8&&c>=12) {
				System.out.println(num + " " + (a+b+c) + " " + "PASS");
			}else {
				System.out.println(num + " " + (a+b+c) + " " + "FAIL");
			}
		}
		br.close();
	}
}
