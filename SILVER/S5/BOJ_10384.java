// BOJ_10384_팬그램

import java.io.*;

public class BOJ_10384 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int t=1;t<=N;t++) {
			String str = br.readLine().toLowerCase();
			int[] count = new int[26];
			for(int i=0;i<str.length();i++	) {
				if(str.charAt(i)>='a'&&str.charAt(i)<='z') {
					count[str.charAt(i)-'a']++;
				}
			}
			int min = Integer.MAX_VALUE;
			for(int i=0;i<26;i++) {
				min=Math.min(min, count[i]);
			}
			
			if(min==0) {
				System.out.println("Case " + t + ": Not a pangram");
			}else if(min==1) {
				System.out.println("Case " + t + ": Pangram!");
			}else if(min==2) {
				System.out.println("Case " + t + ": Double pangram!!");
			}else if(min==3) {
				System.out.println("Case " + t + ": Triple pangram!!!");
			}
		}
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}
}
