// BOJ_15995_잉여역수 구하기

import java.io.*;
import java.util.*;

public class BOJ_15995 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		/* ==========output========== */
		for(int i=1;i<=10000;i++) {
			if(a*i%m==1) {
				System.out.println(i);
				return;
			}
		}
		br.close();
	}
}
