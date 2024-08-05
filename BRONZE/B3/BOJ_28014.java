// BOJ_28014_색종이

import java.io.*;
import java.util.*;

public class BOJ_28014 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		int result = 0;
		int temp = 0;
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			int num = Integer.parseInt(st.nextToken());
			if(temp<num) {
				result++;
			}
			temp=num;
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}
