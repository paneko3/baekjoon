// BOJ_24389_2의 보수

import java.io.*;

public class BOJ_24389 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		int reverse = ~N+1;
		int xor = N ^ reverse;
		int result = 0;
		for(char c : Integer.toBinaryString(xor).toCharArray()) {
			if(c=='1') {
				result++;
			}
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}
