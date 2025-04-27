// BOJ_2417_정수 제곱근

import java.io.*;

public class BOJ_2417 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        /* ==========sol========== */
        long left = 0;
        long right = (long)1e9 + 1;
        while (left < right) {
            long mid = (left + right) / 2;
            if (mid * mid >= n) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        /* ==========output========== */
        System.out.println(left);
		br.close();
	}
}