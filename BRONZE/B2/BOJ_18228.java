// BOJ_18228_펭귄추락대책위원회

import java.io.*;
import java.util.*;

public class BOJ_18228 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int result1 = Integer.MAX_VALUE;
		int result2 = Integer.MAX_VALUE;
		boolean flag = false;
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			int A = Integer.parseInt(st.nextToken());
			if(A==-1) {
				flag=true;
				continue;
			}
			if(!flag) {
				result1=Math.min(result1, A);
			}else {
				result2=Math.min(result2, A);
			}
		}
		System.out.println(result1+result2);
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}
}
