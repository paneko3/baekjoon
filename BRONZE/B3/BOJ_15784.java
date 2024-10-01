// BOJ_15784_질투진서

import java.io.*;
import java.util.*;

public class BOJ_15784 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int[][] map = new int[N+1][N+1];
		for(int i=1;i<=a;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1;j<=b;j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		/* ==========sol========== */
		/* ==========output========== */
		for(int i=1;i<=N;i++) {
			if(map[i][b]>map[a][b]) {
				System.out.println("ANGRY");
				return;
			}
			if(map[a][i]>map[a][b]) {
				System.out.println("ANGRY");
				return;
			}
		}
		System.out.println("HAPPY");
		br.close();
	}
}
