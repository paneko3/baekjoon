// BOJ_11256_사탕

import java.io.*;
import java.util.*;

public class BOJ_11256 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for(int t=0;t<T;t++) {
			/* ==========input========== */
			st = new StringTokenizer(br.readLine());
			int J = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int[] arr = new int[N];
			for(int i=0;i<N;i++) {
				st = new StringTokenizer(br.readLine());
				int R = Integer.parseInt(st.nextToken());
				int C = Integer.parseInt(st.nextToken());
				arr[i]=R*C;
			}
			/* ==========sol========== */
			Arrays.sort(arr);
			int sum = 0;
			int result = 0;
			for(int i=N-1;i>=0;i--) {
				sum+=arr[i];
				result++;
				if(sum>=J) {
					break;
				}
			}
			/* ==========output========== */
			System.out.println(result);
		}
		br.close();
	}
}
