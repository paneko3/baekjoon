// BOJ_27961_고양이는 많을수록 좋다

import java.io.*;

public class BOJ_27961 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine());
		/* ==========sol========== */
		int result = 0;
		if(N>0) {
			result++;
			long k = 1;
			while(k<N) {
				k*=2;
				result++;
			}
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}
