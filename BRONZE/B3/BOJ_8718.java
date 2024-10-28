// BOJ_8718_Bałwanek

import java.io.*;
import java.util.*;

public class BOJ_8718 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		int result = 0;
		if(7000*k<=1000*x) {
			result=Math.max(result,7000*k);
		}
		if(3500*k<=1000*x) {
			result=Math.max(result,3500*k);
		}
		if(1750*k<=1000*x) {
			result=Math.max(result,1750*k);
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}
