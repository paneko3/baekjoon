// BOJ_15787_기차가 어둠을 헤치고 은하수를

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] train = new int[N + 1];
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int cmd = Integer.parseInt(st.nextToken());
			int i1 = Integer.parseInt(st.nextToken());
			if (cmd == 1) {
				int x = Integer.parseInt(st.nextToken());
				train[i1] |= (1 << (x - 1));
			} else if (cmd == 2) {
				int x = Integer.parseInt(st.nextToken());
				train[i1] &= ~(1 << (x - 1));
			} else if (cmd == 3) {
				train[i1] <<= 1;
				train[i1] &= (1 << 20) - 1;
			} else {
				train[i1] >>= 1;
			}
		}
		/* ==========sol========== */
		Set<Integer> set = new HashSet<>();
		for (int i = 1; i <= N; i++) {
			set.add(train[i]);
		}
		int result = set.size();
		/* ==========output========== */
		System.out.println(result);
	}
}
