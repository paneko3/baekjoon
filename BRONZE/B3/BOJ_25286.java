// BOJ_25286_11월 11일

import java.io.*;
import java.util.*;

public class BOJ_25286 {
	static int[] arr = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		for(int i=0;i<N;i++) {
			/* ==========input========== */
			st = new StringTokenizer(br.readLine());
			int y = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			/* ==========sol========== */
			/* ==========output========== */
			if(m==1) {
				System.out.print(y-1 + " " + 12 + " " + 31);
			}else {
				System.out.print(y + " " + (m-1)+ " ");
				if (m == 3 && ((y % 100 != 0 && y % 4 == 0) || y % 400 == 0)) {
					System.out.print(29);
				}else {
					System.out.print(arr[m-1]);
				}
			}
			System.out.println();
		}
		br.close();
	}
}
