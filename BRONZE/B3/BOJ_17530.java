// BOJ_17530_Buffoon

import java.io.*;

public class BOJ_17530 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		int result = arr[0];
		boolean flag = false;
		for(int i=1;i<N;i++) {
			if(arr[i]>result) {
				flag = true;
			}
		}
		System.out.println(flag?"N":"S");
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}
}
