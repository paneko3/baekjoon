// BOJ_5671_호텔 방 번호

import java.io.*;
import java.util.*;

public class BOJ_5671 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        /* ==========sol========== */
        while ((input = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(input);
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int count = 0;

            for (int i = n; i <= m; i++) {
                boolean[] check = new boolean[10];
                int x = i;
                boolean valid = true;

                while (x > 0) {
                    int d = x % 10;
                    if (check[d]) {
                        valid = false;
                        break;
                    }
                    check[d] = true;
                    x /= 10;
                }

                if (valid) count++;
            }

            /* ==========output========== */
            System.out.println(count);
        }
		br.close();
	}
}