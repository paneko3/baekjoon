// BOJ_18691_Pokemon Buddy

import java.io.*;
import java.util.*;

public class BOJ_18691 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for(int t=0;t<T;t++) {
			/* ==========input========== */
			st = new StringTokenizer(br.readLine());
			int G = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			/* ==========sol========== */
			/* ==========output========== */
			if(E-C<0) {
				System.out.println(0);
			}else {
				if(G==1) {
					System.out.println((E-C)*1);
				}else if(G==2) {
					System.out.println((E-C)*3);
				}else {
					System.out.println((E-C)*5);
				}
			}
		}
		br.close();
	}
}
