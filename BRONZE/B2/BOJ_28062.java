// BOJ_28062_준석이의 사탕 사기

import java.io.*;
import java.util.*;

public class BOJ_28062 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Comparator.reverseOrder());
		int result = 0;
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			int n = Integer.parseInt(st.nextToken());
			if(n%2==0) {
				result+=n;
			}else {
				queue.add(n);
			}
		}
		while(queue.size()>1) {
			result += queue.poll() + queue.poll();
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}
