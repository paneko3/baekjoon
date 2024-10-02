// BOJ_29752_최장 스트릭

import java.io.*;
import java.util.*;

public class BOJ_29752 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int sum=0;
		int max=0;
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			int a = Integer.parseInt(st.nextToken());
			if(a==0) {
				sum=0;
				continue;
			}
			sum++;
			max=Math.max(max,sum);
		}
		System.out.println(max);
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}
}
