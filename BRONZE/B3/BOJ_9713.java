// BOJ_9713_Sum of Odd Sequence

import java.io.*;

public class BOJ_9713 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

        /* ==========sol========== */
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            int sum = 0;
            for (int i = 1; i <= N; i += 2) {
                sum += i;
            }

            /* ==========output========== */
            System.out.println(sum);
        }
		br.close();
	}
}