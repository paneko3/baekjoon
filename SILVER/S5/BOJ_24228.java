// BOJ_24228_젓가락

import java.io.*;
import java.util.*;

public class BOJ_24228 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long N = Long.parseLong(st.nextToken());
		long R = Long.parseLong(st.nextToken());
		/* ==========sol========== */
		/* ==========output========== */
		System.out.println(N+2*R-1);
		br.close();
	}
}
