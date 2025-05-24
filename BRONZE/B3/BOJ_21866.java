// BOJ_21866_추첨을 통해 커피를 받자

import java.io.*;
import java.util.*;

public class BOJ_21866 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] limit = {100, 100, 200, 200, 300, 300, 400, 400, 500};
		int result = 0;
		/* ==========sol========== */
		for (int i = 0; i < 9; i++) {
			int score = Integer.parseInt(st.nextToken());
			if (score > limit[i]) {
				System.out.println("hacker");
				return;
			}
			result += score;
		}
		/* ==========output========== */
		System.out.println(result >= 100 ? "draw" : "none");
	}
}
