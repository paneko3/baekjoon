// BOJ_3060_욕심쟁이 돼지

import java.io.*;
import java.util.*;

public class BOJ_3060 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for(int t=0;t<T;t++) {
			/* ==========input========== */
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[6];
			st = new StringTokenizer(br.readLine());
			for(int i=0;i<6;i++) {
				arr[i]=Integer.parseInt(st.nextToken());
			}
			/* ==========sol========== */
			int result = 0;
			while(true) {
				result++;
				int sum = 0;
				for(int i=0;i<6;i++) {
					sum+=arr[i];
				}
				if(sum>N) {
					break;
				}
				int[] newArr = new int[6];
				for(int i=0;i<6;i++) {
					int left = i==0?5:i-1;
					int right = i==5?0:i+1;
					int front = i>2?i-3:i+3;
					newArr[i]+=arr[i]+arr[left]+arr[right]+arr[front];
				}
				for(int i=0;i<6;i++) {
					arr[i]=newArr[i];
				}
			}
			/* ==========output========== */
			System.out.println(result);
		}
		br.close();
	}
}
