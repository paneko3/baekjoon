// BOJ_15128_Congruent Numbers

import java.io.*;
import java.util.*;

public class BOJ_15128 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int p1 = Integer.parseInt(st.nextToken());
        int q1 = Integer.parseInt(st.nextToken());
        int p2 = Integer.parseInt(st.nextToken());
        int q2 = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        long numerator = (long) p1 * p2;
        long denominator = 2L * q1 * q2;
        /* ==========output========== */
        if (numerator % denominator == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        br.close();
	}
}