// BOJ_16397_탈출

import java.io.*;
import java.util.*;

public class BOJ_16397 {
	static class Node{
		int num, count;
		public Node(int num, int count) {
			this.num = num;
			this.count = count;
		}
	}
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
		int G = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		int result = 100000;
		boolean[] visited = new boolean[100000];
		Queue<Node> queue = new LinkedList<Node>();
		visited[N]=true;
		queue.add(new Node(N,0));
		while(!queue.isEmpty()) {
			Node now = queue.poll();
			if(now.count>T) {
				continue;
			}
			if(now.num==G) {
				result = Math.min(result, now.count);
				continue;
			}
			int A = now.num+1;
			if(A<=99999&&!visited[A]) {
				queue.add(new Node(A,now.count+1));
				visited[A]=true;
			}
			if(now.num*2>99999) {
				continue;
			}
			String temp = Integer.toString(now.num*2);
			int first = temp.charAt(0)-'0'-1;
			int B = Integer.parseInt(first+temp.substring(1));
			if(B>=0&&!visited[B]) {
				queue.add(new Node(B,now.count+1));
				visited[B]=true;
			}
		}
		/* ==========output========== */
		System.out.println(result==100000?"ANG":result);
		br.close();
	}
}
