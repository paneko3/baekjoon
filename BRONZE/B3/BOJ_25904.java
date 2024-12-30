// BOJ_25904_안녕 클레오파트라 세상에서 제일가는 포테이토칩

import java.io.*;
import java.util.*;

public class BOJ_25904 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		/* ==========sol========== */
		int idx = 0;
		while(true) {
			if(arr[idx]<X) {
				break;
			}
			idx=(idx==N-1?0:idx+1);
			X++;
		}
		/* ==========output========== */
		System.out.println(idx+1);
		br.close();
	}
}
