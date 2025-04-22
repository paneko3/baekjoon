// BOJ_18511_큰 수 구성하기

import java.io.*;
import java.util.*;

public class BOJ_18511 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int kSize = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        List<Integer> digits = new ArrayList<>();
        for (int i = 0; i < kSize; i++) {
            digits.add(Integer.parseInt(st.nextToken()));
        }

        /* ==========sol========== */
        int max = 0;
        for (int i = 1; i <= N; i++) {
            boolean valid = true;
            int x = i;
            while (x > 0) {
                int d = x % 10;
                if (!digits.contains(d)) {
                    valid = false;
                    break;
                }
                x /= 10;
            }
            if (valid) max = i;
        }

        /* ==========output========== */
        System.out.println(max);
		br.close();
	}
}