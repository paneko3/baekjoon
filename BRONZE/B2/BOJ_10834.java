// BOJ_10834_벨트 

import java.io.*;
import java.util.*;

public class BOJ_10834 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int[][] belts = new int[M][3];
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            belts[i][0] = Integer.parseInt(st.nextToken()); 
            belts[i][1] = Integer.parseInt(st.nextToken()); 
            belts[i][2] = Integer.parseInt(st.nextToken()); 
        }
        /* ==========sol========== */
        long numerator = 1;
        long denominator = 1;
        int direction = 0; 
        for (int i = 0; i < M; i++) {
            int a = belts[i][0];
            int b = belts[i][1];
            int s = belts[i][2];
            numerator *= b;
            denominator *= a;
            if (s == 1) direction ^= 1;
            long gcd = gcd(numerator, denominator);
            numerator /= gcd;
            denominator /= gcd;
        }
        /* ==========output========== */
        System.out.println(direction + " " + (numerator / denominator));
    }
    static long gcd(long a, long b) {
        while (b != 0) {
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}