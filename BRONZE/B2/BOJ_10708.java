// BOJ_10708_크리스마스 파티

import java.io.*;
import java.util.*;

public class BOJ_10708 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int[] A = new int[M+1];
		int[] score = new int[N+1];
		st = new StringTokenizer(br.readLine());
		for(int i=1;i<=M;i++) {
			A[i]=Integer.parseInt(st.nextToken());
		}
		/* ==========sol========== */
		for(int i=1;i<=M;i++) {
			int now = A[i];
			st = new StringTokenizer(br.readLine());
			for(int j=1;j<=N;j++) {
				int num = Integer.parseInt(st.nextToken());
				if(num==now) {
					score[j]++;
				}else {
					score[now]++;
				}
			}
		}
		/* ==========output========== */
		for(int i=1;i<=N;i++) {
			System.out.println(score[i]);
		}
		br.close();
	}
}
