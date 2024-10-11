// BOJ_26215_눈 치우기

import java.io.*;
import java.util.*;

public class BOJ_26215 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			queue.add(Integer.parseInt(st.nextToken()));
		}
		/* ==========sol========== */
		int result = 0;
		while(!queue.isEmpty()) {
			if(result>1440) {
				break;
			}
			if(queue.size()==1) {
				result+=queue.poll();
				break;
			}
			int a1 = queue.poll();
			int a2 = queue.poll();
			if(a1-1>0) {
				queue.add(a1-1);
			}
			if(a2-1>0) {
				queue.add(a2-1);
			}
			result++;
		}
		/* ==========output========== */
		System.out.println(result>1440?-1:result);
		br.close();
	}
}
