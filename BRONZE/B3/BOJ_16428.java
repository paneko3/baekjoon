// BOJ_16428_A/B - 3

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class BOJ_16428 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger A = new BigInteger(st.nextToken());
		BigInteger B = new BigInteger(st.nextToken());
		/* ==========sol========== */
		/* ==========output========== */
		if(A.compareTo(BigInteger.ZERO) == -1 && B.compareTo(BigInteger.ZERO) == -1) {
			System.out.println((A.divide(B)).add(BigInteger.ONE));
			System.out.println((A.remainder(B)).subtract(B));
		}else if(A.compareTo(BigInteger.ZERO) == -1 && B.compareTo(BigInteger.ZERO) == 1){
			System.out.println((A.divide(B)).subtract(BigInteger.ONE));
			System.out.println((A.remainder(B)).add(B));
		}else {
			System.out.println(A.divide(B));
			System.out.println(A.remainder(B));
		}
		br.close();
	}
}
