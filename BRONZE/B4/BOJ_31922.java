// BOJ_31922_이 대회는 이제 제 겁니다

import java.io.*;
import java.util.*;

public class BOJ_31922 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		/* ==========output========== */
		System.out.println(A+C>Q?A+C:Q);
		br.close();
	}
}
