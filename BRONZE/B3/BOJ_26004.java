// BOJ_26004_HI-ARC

import java.io.*;

public class BOJ_26004 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int[] count = new int[5];
		for(int i=0;i<N;i++) {
			if(str.charAt(i)=='H') {
				count[0]++;
			}else if(str.charAt(i)=='I') {
				count[1]++;
			}else if(str.charAt(i)=='A') {
				count[2]++;
			}else if(str.charAt(i)=='R') {
				count[3]++;
			}else if(str.charAt(i)=='C') {
				count[4]++;
			}
		}
		int result = N;
		for(int i=0;i<5;i++) {
			result=Math.min(result, count[i]);
		}
		System.out.println(result);
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}
}
