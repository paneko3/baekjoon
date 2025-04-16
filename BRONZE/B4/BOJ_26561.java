// BOJ_26561_Population

import java.io.*;
import java.util.*;

public class BOJ_26561 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long p = Long.parseLong(st.nextToken());
            long t = Long.parseLong(st.nextToken());
            long result = p + (t / 4) - (t / 7);
            /* ==========output========== */
            System.out.println(result);
        }
		br.close();
	}
}