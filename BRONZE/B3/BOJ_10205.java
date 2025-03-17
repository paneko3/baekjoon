// BOJ_10205_헤라클레스와 히드라

import java.io.*;

public class BOJ_10205 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		for(int k=1;k<=K;k++) {
			/* ==========input========== */
			int h = Integer.parseInt(br.readLine());
			String str = br.readLine();
			/* ==========sol========== */
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)=='c') {
					h++;
				}else {
					h--;
				}
			}
			/* ==========output========== */
			System.out.println("Data Set " + k +":");
			System.out.println(h);
			System.out.println();
		}
		br.close();
	}
}
