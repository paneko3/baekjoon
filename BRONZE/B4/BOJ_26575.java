// BOJ_26575_Pups

import java.io.*;
import java.util.*;

public class BOJ_26575 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        /* ==========sol + output========== */
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double d = Double.parseDouble(st.nextToken());   // number of dogs (can be decimal!)
            double f = Double.parseDouble(st.nextToken());   // food per dog
            double p = Double.parseDouble(st.nextToken());   // price per pound
            double total = d * f * p;
            System.out.printf("$%.2f\n", total);
        }
        br.close();
	}
}