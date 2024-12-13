// BOJ_1975_Number Game

import java.io.*;

public class BOJ_1975 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int t=0;t<T;t++) {
			/* ==========input========== */
			int N = Integer.parseInt(br.readLine()); 
			/* ==========sol========== */
			int result = 0;
			for(int i=2;i<=N;i++) {
				int temp = N;
				while(true) {
					if(temp%i!=0) {
						break;
					}
					result++;
					temp/=i;
				}
			}
			/* ==========output========== */
			System.out.println(result);
		}
		br.close();
	}
}
