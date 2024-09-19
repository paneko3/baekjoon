// BOJ_9047_6174

import java.io.*;
import java.util.Arrays;

public class BOJ_9047 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int t=0;t<T;t++) {
			int N = Integer.parseInt(br.readLine());
			int result = 0;
			while(true) {
				if(N==6174) {
					break;
				}
				int[] arr = new int[4];
				for(int i=0;i<4;i++) {
					arr[i]=N%10;
					N/=10;
				}
				Arrays.sort(arr);
				int max = 0;
				int min = 0;
				for (int i = 0; i < 4; i++) {
	                min=min*10+arr[i];
	                max=max*10+arr[3-i];
	            }
				N=max-min;
				System.out.println(N);
				result++;
			}
			System.out.println(result);
		}
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}
}
