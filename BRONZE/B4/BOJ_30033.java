// BOJ_30033_Rust Study

import java.io.*;
import java.util.*;

public class BOJ_30033 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int[] A = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		/* ==========sol========== */
		int result = 0;
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			if(A[i]<=Integer.parseInt(st.nextToken())) {
				result++;
			}
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}
