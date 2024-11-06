// BOJ_17127_벚꽃이 정보섬에 피어난 이유

import java.io.*;
import java.util.*;

public class BOJ_17127 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		int result = 0;
		for(int i=0;i<N-1;i++) {
			for(int j=i+1;j<N-1;j++) {
				for(int k=j+1;k<N-1;k++) {
					int a = cal(arr,0,i);
					int b = cal(arr,i+1,j);
					int c = cal(arr,j+1,k);
					int d = cal(arr,k+1,N-1);
					result=Math.max(result, a+b+c+d);
				}
			}
		}
		System.out.println(result);
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}
	static int cal(int[] arr, int a, int b) {
		int sum = 1;
		for(int i=a;i<=b;i++) {
			sum*=arr[i];
		}
		return sum;
	}
}
