// BOJ_16401_과자 나눠주기

import java.io.*;
import java.util.*;

public class BOJ_16401 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		int max = 0;
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			max=Math.max(max, arr[i]);
		}
		/* ==========sol========== */
		int left = 1;
		int right = max;
		int result = 0;
		while(left<=right) {
			int mid = left+(right-left)/2;
			int count = 0;
			for(int i=0;i<N;i++	) {
				count+=arr[i]/mid;
			}
			if(M>count) {
				right=mid-1;
			}else {
				result = mid;
				left=mid+1;
			}
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}
