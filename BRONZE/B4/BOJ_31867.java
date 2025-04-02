// BOJ_31867_홀짝홀짝

import java.io.*;

public class BOJ_31867 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		/* ==========sol========== */
		int even = 0;
		int odd = 0;
		for(int i=0;i<N;i++) {
			if((str.charAt(i)-'0')%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		/* ==========output========== */
		System.out.println(even>odd?0:(even<odd?1:-1));
		br.close();
	}
}