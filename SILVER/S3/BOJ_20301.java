// BOJ_20301_반전 요세푸스

import java.io.*;
import java.util.*;

public class BOJ_20301 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            dq.offer(i);
        }
        StringBuilder sb = new StringBuilder();
        boolean forward = true;
        int kCnt = 0;
        int mCnt = 0;
        while (!dq.isEmpty()) {
            if (++kCnt < K) {
                if (forward) dq.offerLast(dq.pollFirst());
                else dq.offerFirst(dq.pollLast());
            } else {
                kCnt = 0;
                sb.append(dq.pollFirst()).append("\n");
                if (++mCnt == M) {
                    mCnt = 0;
                    forward = !forward;
                }
                if (!forward && dq.size() != 0) dq.offerFirst(dq.pollLast());
            }
        }
		/* ==========output========== */
        System.out.print(sb);
		br.close();
	}
}
