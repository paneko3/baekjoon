// BOJ_1434_책 정리

import java.io.*;
import java.util.*;

public class BOJ_1434 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		int[] box = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			box[i]=Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		int idx = 0;
		for(int i=0;i<M;i++) {
			int B = Integer.parseInt(st.nextToken());
			while(idx<N) {
				if(box[idx]>=B) {
					box[idx]-=B;
					break;
				}else {
					idx++;
				}
			}
		}
		int result = 0;
		for(int i=0;i<N;i++) {
			result+=box[i];
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}
