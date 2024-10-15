// BOJ_28061_레몬 따기

import java.io.*;
import java.util.*;

public class BOJ_28061 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		int result = 0;
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			int num= Integer.parseInt(st.nextToken());
			result=Math.max(result, num-(N-i));
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}
