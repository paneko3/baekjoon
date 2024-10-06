// BOJ_13118_뉴턴과 사과

import java.io.*;
import java.util.*;

public class BOJ_13118 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[5];
		for(int i=1;i<=4;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		int result = 0;
		for(int i=1;i<=4;i++) {
			if(arr[i]==x) {
				result=i;
			}
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}
