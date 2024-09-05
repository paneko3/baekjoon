// BOJ_8760_Schronisko

import java.io.*;
import java.util.*;

public class BOJ_8760 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int Z = Integer.parseInt(st.nextToken());
		for(int i=0;i<Z;i++) {
			st = new StringTokenizer(br.readLine());
			int W = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			System.out.println(W*K/2);
		}
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}
}
