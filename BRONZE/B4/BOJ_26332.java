// BOJ_26332_Buying in Bulk

import java.io.*;
import java.util.*;

public class BOJ_26332 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		for(int i=0;i<n;i++) {
			/* ==========input========== */
			st = new StringTokenizer(br.readLine());
			int c = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			/* ==========sol========== */
			/* ==========output========== */
			System.out.println(c + " " + p);
			System.out.println(c==1?p:p*c-(c-1)*2);
		}
		br.close();
	}
}
