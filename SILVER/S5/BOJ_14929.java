// BOJ_14929_귀찮아 (SIB)

import java.io.*;
import java.util.*;

public class BOJ_14929 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        /* ==========sol========== */
        long sum = 0;
        long sumSq = 0;
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(st.nextToken());
            sum += x;
            sumSq += (long) x * x;
        }
        long result = (sum * sum - sumSq) / 2;
        /* ==========output========== */
        System.out.println(result);
		br.close();
	}
}