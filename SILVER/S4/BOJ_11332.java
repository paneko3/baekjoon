// BOJ_11332_시간초과

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class BOJ_11332 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int C = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		StringBuilder sb = new StringBuilder();
		for(int c=0;c<C;c++) {
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			String n = st.nextToken();
			BigInteger t = new BigInteger(st.nextToken());
			BigInteger l = new BigInteger(String.valueOf(Integer.parseInt(st.nextToken()) * 100000000));
			BigInteger bi = new BigInteger(n);
			if (s.equals("O(N)")) {
			    if (bi.multiply(t).compareTo(l) == 1) {
			        sb.append("TLE!\n");
			    } else {
			        sb.append("May Pass.\n");
			    }
			} else if (s.equals("O(N^2)")) {
			    if (bi.pow(2).multiply(t).compareTo(l) == 1) {
			        sb.append("TLE!\n");
			    } else {
			        sb.append("May Pass.\n");
			    }
			} else if (s.equals("O(N^3)")) {
			    if (bi.pow(3).multiply(t).compareTo(l) == 1) {
			        sb.append("TLE!\n");
			    } else {
			        sb.append("May Pass.\n");
			    }
			} else if (s.equals("O(2^N)")) {
			    bi = new BigInteger("2");
			    if (bi.pow(Integer.valueOf(n)).multiply(t).compareTo(l) == 1) {
			        sb.append("TLE!\n");
			    } else {
			        sb.append("May Pass.\n");
			    }
			} else {
			    int N = Integer.valueOf(n);
			    while (N-- > 1) {
			        bi = bi.multiply(new BigInteger(String.valueOf(N)));
			        if (bi.compareTo(l) == 1) {
			            break;
			        }
			    }
			    if (bi.multiply(t).compareTo(l) == 1) {
			        sb.append("TLE!\n");
			    } else {
			        sb.append("May Pass.\n");
			    }
			}
		}
		/* ==========output========== */
		System.out.println(sb);
		br.close();
	}
}
