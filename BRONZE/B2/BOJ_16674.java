// BOJ_16674_2018년을 되돌아보며

import java.io.*;

public class BOJ_16674 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int[] count = new int[10];
		for(int i=0;i<str.length();i++) {
			count[str.charAt(i)-'0']++;
		}
		int result = 0;
		for(int i=3;i<10;i++) {
			if(i==8) {
				continue;
			}
			if(count[i]>0) {
				System.out.println(result);
				return;
			}
		}
		result=1;
		if(count[0]>0&&count[1]>0&&count[2]>0&&count[8]>0) {
			result=2;
			if(count[0]==count[1]&&count[0]==count[2]&&count[0]==count[8]) {
				result=8;
			}
		}
		System.out.println(result);
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}
}
