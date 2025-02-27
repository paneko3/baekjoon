// BOJ_23246_Sport Climbing Combined

import java.io.*;
import java.util.*;

public class BOJ_23246 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int[][] arr = new int[N][3];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			int b = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			int q = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			arr[i][0]=b;
			arr[i][1]=p*q*r;
			arr[i][2]=p+q+r;
		}
		/* ==========sol========== */
		Arrays.sort(arr,new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				if(o1[1]==o2[1]) {
					if(o1[2]==o2[2]) {
						return o1[0]-o2[0];
					}else {
						return o1[2]-o2[2];
					}
				}else {
					return o1[1]-o2[1];
				}
			}
		});
		/* ==========output========== */
		System.out.println(arr[0][0] + " " + arr[1][0] + " " + arr[2][0]);;
		br.close();
	}
}
