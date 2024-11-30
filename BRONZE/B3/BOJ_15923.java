// BOJ_15923_욱제는 건축왕이야!!

import java.io.*;
import java.util.*;

public class BOJ_15923 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		double result = 0;
		int[][] arr = new int[N][2];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0]=Integer.parseInt(st.nextToken());
			arr[i][1]=Integer.parseInt(st.nextToken());
		}
		/* ==========sol========== */
		for(int i=0;i<N;i++) {
			double len = 0;
			if(i==0) {
				len = Math.sqrt(Math.pow(arr[0][0]-arr[N-1][0], 2)+Math.pow(arr[0][1]-arr[N-1][1], 2));
			}else {
				len = Math.sqrt(Math.pow(arr[i][0]-arr[i-1][0], 2)+Math.pow(arr[i][1]-arr[i-1][1], 2));
			}
			result+=len;
		}
		/* ==========output========== */
		System.out.println((int)(result));
		br.close();
	}
}
