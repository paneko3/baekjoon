// BOJ_11558_The Game of Death

import java.io.*;

public class BOJ_11558 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int t=0;t<T;t++) {
			/* ==========input========== */
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[N+1];
			for(int i=1;i<=N;i++) {
				arr[i]=Integer.parseInt(br.readLine());
			}
			/* ==========sol========== */
			int now = 1;
			int result = 0;
			for(int i=1;i<=N;i++) {
				now = arr[now];
				if(now==N) {
					result=i;
					break;
				}
			}
			/* ==========output========== */
			System.out.println(result);
		}
		br.close();
	}
}
