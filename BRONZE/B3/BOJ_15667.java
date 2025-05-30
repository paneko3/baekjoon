// BOJ_15667_2018 연세대학교 프로그래밍 경진대회

import java.io.*;
import java.math.BigInteger;

public class BOJ_15667 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger N = new BigInteger(br.readLine());
		/* ==========sol========== */
		N = N.subtract(BigInteger.ONE); // N - 1 = K + K^2
		BigInteger left = BigInteger.ONE, right = N;
		BigInteger result = BigInteger.ZERO;
		while (left.compareTo(right) <= 0) {
			BigInteger mid = left.add(right).divide(BigInteger.TWO);
			BigInteger expr = mid.add(mid.multiply(mid)); // K + K^2
			int cmp = expr.compareTo(N);
			if (cmp == 0) {
				result = mid;
				break;
			} else if (cmp < 0) {
				left = mid.add(BigInteger.ONE);
			} else {
				right = mid.subtract(BigInteger.ONE);
			}
		}
		/* ==========output========== */
		System.out.println(result);
	}
}
