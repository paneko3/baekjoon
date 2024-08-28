// BOJ_20551_Sort 마스터 배지훈의 후계자

import java.io.*;
import java.util.*;

public class BOJ_20551 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] A = new int[N];
		for(int i=0;i<N;i++) {
			A[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(A);
		for(int i=0;i<M;i++) {
			/* ==========sol========== */
			int D = Integer.parseInt(br.readLine());
			int left = 0;
			int right = N-1;
			int result = -1;
			while(left<=right) {
				int mid = (left+right)/2;
				if(A[mid]>=D) {
					if(A[mid]==D) {
						result = mid;
					}
					right=mid-1;
				}else if(A[mid]<D){
					left=mid+1;
				}
			}
			/* ==========output========== */
			System.out.println(result);
		}
		br.close();
	}
}
