// BOJ_17466_N! mod P (1)

import java.io.*;
import java.util.*;

public class BOJ_17466 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long N = Long.parseLong(st.nextToken());
		long P = Long.parseLong(st.nextToken());
		/* ==========sol========== */
		long result = 1;
		for(int i=2;i<=N;i++) {
			result = (result*i)%P;
		}
		/* ==========output========== */
		System.out.println(result%P);
		br.close();
	}
}
