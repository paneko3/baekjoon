// BOJ_17520_Balanced String

import java.io.*;

public class BOJ_17520 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		n = (n%2==0?n/2:n/2+1);
		int result = 1;
		for(int i=1;i<=n;i++) {
			result=result*2%16769023;
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}
