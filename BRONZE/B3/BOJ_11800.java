// BOJ_11800_Tawla

import java.io.*;
import java.util.*;

public class BOJ_11800 {
	static String[] arr = {"Yakk","Doh","Seh","Ghar","Bang","Sheesh","Habb Yakk","Dobara","Dousa","Dorgy","Dabash","Dosh","Sheesh Beesh"};
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for(int t=1;t<=T;t++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			/* ==========sol========== */
			if(a<b) {
				int temp = a;
				a=b;
				b=temp;
			}
			/* ==========output========== */
			if(a==b) {
				System.out.println("Case " + t +": " + arr[5+a]);
			}else {
				if(a==6&&b==5) {
					System.out.println("Case " + t +": " + arr[12]);
				}else {
					System.out.println("Case " + t +": " + arr[a-1]+ " " + arr[b-1]);
				}
			}
		}
		br.close();
	}
}
