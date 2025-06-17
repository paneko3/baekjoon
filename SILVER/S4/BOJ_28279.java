// BOJ_28279_덱2

import java.io.*;
import java.util.*;

public class BOJ_28279 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int cmd = Integer.parseInt(st.nextToken());
			if (cmd == 1) {
				int X = Integer.parseInt(st.nextToken());
				dq.addFirst(X);
			} else if (cmd == 2) {
				int X = Integer.parseInt(st.nextToken());
				dq.addLast(X);
			} else if (cmd == 3) {
				if (dq.isEmpty()) {
					sb.append("-1\n");
				} else {
					sb.append(dq.removeFirst()).append("\n");
				}
			} else if (cmd == 4) {
				if (dq.isEmpty()) {
					sb.append("-1\n");
				} else {
					sb.append(dq.removeLast()).append("\n");
				}
			} else if (cmd == 5) {
				sb.append(dq.size()).append("\n");
			} else if (cmd == 6) {
				if (dq.isEmpty()) {
					sb.append("1\n");
				} else {
					sb.append("0\n");
				}
			} else if (cmd == 7) {
				if (dq.isEmpty()) {
					sb.append("-1\n");
				} else {
					sb.append(dq.peekFirst()).append("\n");
				}
			} else if (cmd == 8) {
				if (dq.isEmpty()) {
					sb.append("-1\n");
				} else {
					sb.append(dq.peekLast()).append("\n");
				}
			}
		}
		/* ==========output========== */
		System.out.print(sb);
	}
}
