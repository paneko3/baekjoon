// BOJ_30468_호반우가 학교에 지각한 이유 1

import java.io.*;
import java.util.*;

public class BOJ_30468 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int STR = Integer.parseInt(st.nextToken());
		int DEX = Integer.parseInt(st.nextToken());
		int INT = Integer.parseInt(st.nextToken());
		int LUK = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		System.out.println(Math.max(0, N*4-(STR+DEX+INT+LUK)));
		
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}
}
