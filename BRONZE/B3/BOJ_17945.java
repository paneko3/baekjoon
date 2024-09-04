// BOJ_17945_통학의 신

import java.io.*;
import java.util.*;

public class BOJ_17945 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		int x1 = -A+(int)Math.sqrt(A*A-B);
		int x2 = -A-(int)Math.sqrt(A*A-B);
		/* ==========output========== */
		System.out.println(x1==x2?x1:(x2 + " " +x1));
		br.close();
	}
}
