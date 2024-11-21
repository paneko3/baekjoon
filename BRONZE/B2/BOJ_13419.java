// BOJ_13419_탕수육

import java.io.*;

public class BOJ_13419 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int t=0;t<N;t++) {
			String str = br.readLine();
			/* ==========sol========== */
			/* ==========output========== */
			if(str.length()%2==0) {
				for(int i=0;i<str.length();i+=2) {
					System.out.print(str.charAt(i));
				}
				System.out.println();
				for(int i=1;i<str.length();i+=2) {
					System.out.print(str.charAt(i));
				}
				System.out.println();
			}else {
				for(int i=0;i<str.length();i+=2) {
					System.out.print(str.charAt(i));
				}
				for(int i=1;i<str.length();i+=2) {
					System.out.print(str.charAt(i));
				}
				System.out.println();
				for(int i=1;i<str.length();i+=2) {
					System.out.print(str.charAt(i));
				}
				for(int i=0;i<str.length();i+=2) {
					System.out.print(str.charAt(i));
				}
				System.out.println();
			}
			
		}
		br.close();
	}
}
