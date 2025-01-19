// BOJ_11880_개미

import java.io.*;
import java.util.*;

public class BOJ_11880 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for(int t=0;t<T;t++) {
			/* ==========input========== */
			st = new StringTokenizer(br.readLine());
			long a = Long.parseLong(st.nextToken());
			long b = Long.parseLong(st.nextToken());
			long c = Long.parseLong(st.nextToken());
			/* ==========sol========== */
			/* ==========output========== */
			long result = Math.min((a+b)*(a+b)+c*c, Math.min((a+c)*(a+c)+b*b,(b+c)*(b+c)+a*a));
			System.out.println(result);
		}
		br.close();
	}
}
