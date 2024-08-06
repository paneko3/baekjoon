// BOJ_10865_친구 친구

import java.io.*;
import java.util.*;

public class BOJ_10865 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		int[] count = new int[N+1];
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			count[A]++;
			count[B]++;
		}
		/* ==========output========== */
		for(int i=1;i<=N;i++) {
			System.out.println(count[i]);
		}
		br.close();
	}
}
