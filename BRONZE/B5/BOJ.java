// BOJ

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long A = Long.parseLong(st.nextToken());
	    long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());
		/* ==========sol========== */
		/* ==========output========== */
		System.out.println(A+B+C);
		br.close();
	}

}
