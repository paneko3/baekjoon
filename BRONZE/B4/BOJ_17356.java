// BOJ_17356_욱 제

import java.io.*;
import java.util.*;

public class BOJ_17356 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        /* ==========sol========== */
        double M = (B - A) / 400.0;
        double result = 1 / (1 + Math.pow(10, M));

        /* ==========output========== */
        System.out.printf("%.10f\n", result);
		br.close();
	}
}