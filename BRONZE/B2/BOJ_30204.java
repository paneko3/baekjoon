// BOJ_30204_병영외 급식

import java.io.*;
import java.util.*;

public class BOJ_30204 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int sum = 0;
		for(int i=0;i<N;i++) {
			sum+=Integer.parseInt(st.nextToken());
		}
		/* ==========sol========== */
		/* ==========output========== */
		System.out.println(sum%X==0?1:0);
		br.close();
	}
}
