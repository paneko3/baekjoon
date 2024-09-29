// BOJ_2052_지수연산

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BOJ_2052 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		double d = Math.pow(0.5, N);
		BigDecimal result = new BigDecimal(d);
		result = result.setScale(N, RoundingMode.HALF_UP);
		/* ==========output========== */
		System.out.println(result.toPlainString());
		br.close();
	}
}
