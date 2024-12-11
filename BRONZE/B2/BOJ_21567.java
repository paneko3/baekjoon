// BOJ_21567_숫자의 개수 2

import java.io.*;
import java.math.BigInteger;

public class BOJ_21567 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger A = new BigInteger(br.readLine());
		BigInteger B = new BigInteger(br.readLine());
		BigInteger C = new BigInteger(br.readLine());
		BigInteger S = A.multiply(B.multiply(C));
		int[] count = new int[10];
		while(!S.equals(BigInteger.ZERO)) {
			count[S.remainder(BigInteger.TEN).intValue()]++;
			S = S.divide(BigInteger.TEN);
		}
		for(int i=0;i<10;i++) {
			System.out.println(count[i]);
		}
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}
}
