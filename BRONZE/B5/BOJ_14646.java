// BOJ_14646_욱제는 결정장애야!!

import java.io.*;
import java.util.*;

public class BOJ_14646 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] menu = new int[N+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		/* ==========sol========== */
		int result = 0;
		int count = 0;
		while(st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			if(++menu[num]==1) {
				count++;
			}else {
				count--;
			}
			result=Math.max(result, count);
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}
