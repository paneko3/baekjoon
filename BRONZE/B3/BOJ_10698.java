// BOJ_10698_Ahmed Aly

import java.io.*;
import java.util.*;

public class BOJ_10698 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for(int t=1;t<=T;t++) {
			st = new StringTokenizer(br.readLine());
			int X = Integer.parseInt(st.nextToken());
			char O = st.nextToken().charAt(0);
			int Y = Integer.parseInt(st.nextToken());
			st.nextToken();
			int Z = Integer.parseInt(st.nextToken());
			if(O=='+') {
				System.out.println("Case " + t + ": " + (X+Y==Z?"YES":"NO"));
			}else {
				System.out.println("Case " + t + ": " + (X-Y==Z?"YES":"NO"));
			}
		}
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}
}
