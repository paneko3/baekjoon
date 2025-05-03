// BOJ_2145_숫자 놀이

import java.io.*;

public class BOJ_2145 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        /* ==========sol & output========== */
        while (!(line = br.readLine()).equals("0")) {
            int n = Integer.parseInt(line);
            while (n >= 10) {
                int sum = 0;
                while (n > 0) {
                    sum += n % 10;
                    n /= 10;
                }
                n = sum;
            }

            /* ==========output========== */
            System.out.println(n);
        }
		br.close();
	}
}