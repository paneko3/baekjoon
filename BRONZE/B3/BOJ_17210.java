// BOJ_17210_문문문

import java.io.*;

public class BOJ_17210 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine());
		long M = Long.parseLong(br.readLine());
		/* ==========sol========== */
		/* ==========output========== */
		if(N<=5) {
			for(int i=0;i<N-1;i++) {
				if(M==0) {
					System.out.println(1);
					M=1;
				}else {
					System.out.println(0);
					M=0;
				}
			}
		}else {
			System.out.println("Love is open door");
		}
		br.close();
	}
}
