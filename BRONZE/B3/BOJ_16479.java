// BOJ_16479_컵라면 측정하기

import java.io.*;
import java.util.*;

public class BOJ_16479 {
	public static void main(String[] args) throws IOException {
		 /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double K = Double.parseDouble(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double D1 = Double.parseDouble(st.nextToken());
        double D2 = Double.parseDouble(st.nextToken());

        /* ==========sol========== */
        double diff = (D2 - D1) / 2.0;
        double h2 = K * K - diff * diff;

        /* ==========output========== */
        System.out.printf("%.10f\n", h2);
		br.close();
	}
}