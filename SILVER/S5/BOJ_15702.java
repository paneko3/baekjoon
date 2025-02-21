// BOJ_15702_중간고사 채점

import java.io.*;
import java.util.*;

public class BOJ_15702 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] score = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			score[i]=Integer.parseInt(st.nextToken());
		}
		/* ==========sol========== */
		int[][] arr = new int[M][2];
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			int sum = 0;
			for(int j=0;j<N;j++) {
				if(st.nextToken().equals("O")) {
					sum+=score[j];
				}
			}
			arr[i][0]=num;
			arr[i][1]=sum;
		}
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if(o1[1]==o2[1]) {
					return o1[0]-o2[0];
				}else {
					return o2[1]-o1[1];
				}
			}
		});
		/* ==========output========== */
		System.out.println(arr[0][0] + " " + arr[0][1]);
		br.close();
	}
}
