// BOJ_26517_연속인가? ?

import java.io.*;
import java.util.*;

public class BOJ_26517 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());
        long d = Long.parseLong(st.nextToken());

        /* ==========sol========== */
        long left = a * k + b;
        long right = c * k + d;

        /* ==========output========== */
        if (left == right) {
            System.out.println("Yes " + left);
        } else {
            System.out.println("No");
        }

        br.close();
    }
}