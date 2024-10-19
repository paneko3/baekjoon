// BOJ_18512_점프 점프

import java.io.*;
import java.util.*;

public class BOJ_18512 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int X = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());
		int P1 = Integer.parseInt(st.nextToken());
		int P2 = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		boolean[] visit = new boolean[10001];
		while(P1<=10000) {
			visit[P1]=true;
			P1+=X;
		}
		/* ==========output========== */
		while(P2<=10000) {
			if(visit[P2]) {
				System.out.println(P2);
				return;
			}
			P2+=Y;
		}
		System.out.println(-1);
		br.close();
	}
}
