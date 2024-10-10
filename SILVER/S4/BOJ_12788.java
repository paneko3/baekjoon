// BOJ_12788_제 2회 IUPC는 잘 개최될 수 있을까?

import java.io.*;
import java.util.*;

public class BOJ_12788 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		/* ==========sol========== */
		Arrays.sort(arr);
		int result = 0;
		int sum = 0;
		for(int i=N-1;i>=0;i--) {
			result++;
			sum+=arr[i];
			if(sum>=M*K) {
				break;
			}
		}
		/* ==========output========== */
		System.out.println(sum>=M*K?result:"STRESS");
		br.close();
	}
}
