// BOJ_19946_2의 제곱수 계산하기

import java.io.*;
import java.math.BigInteger;

public class BOJ_19946 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger N = new BigInteger(br.readLine());
		/* ==========sol========== */
		int K = 64;
		while(true) {
			if(N.mod(BigInteger.TWO)!=BigInteger.ZERO) {
				break;
			}
			K--;
			N = N.divide(BigInteger.TWO);
		}
		/* ==========output========== */
		System.out.println(K);
		br.close();
	}
}
