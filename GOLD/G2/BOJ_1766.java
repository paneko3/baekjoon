// BOJ_1766_문제집

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ_1766 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] indegree = new int[N + 1];
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            graph.get(from).add(to);
            indegree[to]++;
        }
        /* ==========sol========== */
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 1; i <= N; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            int now = queue.poll();
            sb.append(now).append(" ");
            for (int i = 0; i < graph.get(now).size(); i++) {
                int temp = graph.get(now).get(i);
                indegree[temp]--;
                if (indegree[temp] == 0) {
                    queue.offer(temp);
                }
            }
        }
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
}
