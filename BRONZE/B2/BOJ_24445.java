// BOJ_24445_알고리즘 수업 - 너비 우선 탐색 2

import java.io.*;
import java.util.*;

public class BOJ_24445 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		ArrayList<Integer>[] graph = new ArrayList[N+1];
		for(int i=1;i<=N;i++) {
			graph[i] = new ArrayList<Integer>();
		}
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			graph[u].add(v);
			graph[v].add(u);
		}
		/* ==========sol========== */
		boolean[] visited = new boolean[N+1];
		Queue<Integer> queue = new LinkedList<>();
		visited[R] = true;
		queue.add(R);
		int[] result = new int[N+1];
		int count = 1;
		result[R]=count++;
		while(!queue.isEmpty()) {
			int now = queue.poll();
			Collections.sort(graph[now], Collections.reverseOrder());
			for(int num : graph[now]) {
				if(visited[num]) {
					continue;
				}
				visited[num]=true;
				queue.add(num);
				result[num]=count++;
			}
		}
		/* ==========output========== */
		for(int i=1;i<=N;i++) {
			System.out.println(result[i]);
		}
		br.close();
	}
}
