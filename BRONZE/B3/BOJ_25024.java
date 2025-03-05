// BOJ_25024_시간과 날짜

import java.io.*;
import java.util.*;

public class BOJ_25024 {
	static int[] days = {0,31,29,31,30,31,30,31,31,30,31,30,31};
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for(int t=0;t<T;t++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			/* ==========sol========== */
			/* ==========output========== */
			if(x<=23) {
				if(y<=59) {
					System.out.print("Yes");
				}else {
					System.out.print("No");
				}
			}else {
				System.out.print("No");
			} 
			if(x<=12&&x>=1) {
				if(y<=days[x]&&y>=1) {
					System.out.print(" Yes");
				}else {
					System.out.print(" No");
				}
			}else {
				System.out.print(" No");
			}
			System.out.println();
		}
		br.close();
	}
}
