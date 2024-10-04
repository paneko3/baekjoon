// BOJ_3584_가장 가까운 공통 조상

import java.io.*;
import java.util.*;

public class BOJ_3584 {
	static int N;
	static int[] parent;
	static boolean[] visit;
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine()); 
		for(int t=0;t<T;t++) {
			int N = Integer.parseInt(br.readLine());
			parent = new int[N+1];
			visit = new boolean[N+1];
			for(int i=0;i<N-1;i++) {
				st = new StringTokenizer(br.readLine());
				int A = Integer.parseInt(st.nextToken());
				int B = Integer.parseInt(st.nextToken());
				parent[B]=A;
			}
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			/* ==========sol========== */
			/* ==========output========== */
			sol(x,y);
		}
		br.close();
	}
	static void sol(int x, int y) {
		while(x>0) {
			visit[x]=true;
			x = parent[x];
		}
		while(y>0) {
			if(visit[y]) {
				System.out.println(y);
				break;
			}
			y=parent[y];
		}
	}
}
