// BOJ_10709_기상캐스터

import java.io.*;
import java.util.*;

public class BOJ_10709 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int[][] result = new int[H+1][W+1];
		for(int i=1;i<=H;i++) {
			String str = br.readLine();
			for(int j=1;j<=W;j++) {
				result[i][j]=(str.charAt(j-1)=='c'?0:-1);
			}
		}
		for(int i=1;i<=H;i++) {
			for(int j=1;j<=W;j++) {
				if(result[i][j]==0) {
					for(int k=j+1;k<=W;k++) {
						if(result[i][k]!=0) {
							result[i][k] = result[i][k-1]+1;
						}
					}
				}
			}
		}
		for(int i=1;i<=H;i++) {
			for(int j=1;j<=W;j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}
}
