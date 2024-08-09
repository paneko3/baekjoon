// BOJ_5566_주사위 게임

import java.io.*;
import java.util.*;

public class BOJ_5566 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] map = new int[N+1];
		for(int i=1;i<=N;i++) {
			map[i]=Integer.parseInt(br.readLine());
		}
		/* ==========sol========== */
		int result = 0;
		int now = 1;
		for(int i=1;i<=M;i++) {
			int dice=Integer.parseInt(br.readLine());
			result++;
			now+=dice;
			if(now>=N) {
				break;
			}
			now+=map[now];
			if(now>=N) {
				break;
			}
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}
