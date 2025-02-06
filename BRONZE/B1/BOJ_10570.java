// BOJ_10570_Favorite Number

import java.io.*;

public class BOJ_10570 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int t=0;t<N;t++) {
			/* ==========input========== */
			int V = Integer.parseInt(br.readLine());
			int[] arr = new int[1001];
			for(int i=0;i<V;i++) {
				arr[Integer.parseInt(br.readLine())]++;
			}
			/* ==========sol========== */
			int max = 0;
			int result = 0;
			for(int i=1;i<=1000;i++) {
				if(max<arr[i]) {
					max=arr[i];
					result=i;
				}
			}
			/* ==========output========== */
			System.out.println(result);
		}
		br.close();
	}
}
