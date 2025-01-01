// BOJ_25641_균형 잡힌 소떡소떡

import java.io.*;

public class BOJ_25641 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		/* ==========sol========== */
		int numS = 0;
		int numT = 0;
		for(int i=0;i<N;i++) {
			if(str.charAt(i)=='s') {
				numS++;
			}else {
				numT++;
			}
		}
		int count = 0;
		for(int i=0;i<N;i++) {
			if(numS==numT) {
				break;
			}
			if(str.charAt(i)=='s') {
				numS--;
			}else {
				numT--;
			}
			count++;
		}
		/* ==========output========== */
		for(int i=count;i<N;i++) {
			System.out.print(str.charAt(i));
		}
		br.close();
	}
}
