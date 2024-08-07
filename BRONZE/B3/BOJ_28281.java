// BOJ_28281_선물

import java.io.*;
import java.util.*;

public class BOJ_28281 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		int[] arr = new int[N+1];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int min = Integer.MAX_VALUE;
		for(int i=0;i<N-1;i++) {
			min = Math.min(min, arr[i]+arr[i+1]);
		}
		/* ==========output========== */
		System.out.println(min*X);
		br.close();
	}
}
