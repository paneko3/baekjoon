// BOJ_17224_APC는_왜_서브태스크_대회가_되었을까

import java.io.*;
import java.util.*;

public class BOJ_17224 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int hard = 0, easy = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int sub1 = Integer.parseInt(st.nextToken());
			int sub2 = Integer.parseInt(st.nextToken());
			if (sub2 <= l) hard++;
			else if (sub1 <= l) easy++;
		}
		/* ==========sol========== */
		int result = 0;
		int takeHard = Math.min(k, hard);
		result += takeHard * 140;
		k -= takeHard;
		int takeEasy = Math.min(k, easy);
		result += takeEasy * 100;
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}
