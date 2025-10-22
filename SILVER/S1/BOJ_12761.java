// BOJ_12761_돌다리

import java.io.*;
import java.util.*;

public class BOJ_12761 {
    
    private static final int MAX_POS = 100000;

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        /* ==========sol========== */
        
        Queue<Integer> q = new LinkedList<>();
        int[] visited = new int[MAX_POS + 1];
        Arrays.fill(visited, -1);
        
        q.offer(N);
        visited[N] = 0;
        
        int[] moves = {1, -1, A, -A, B, -B};
        
        while (!q.isEmpty()) {
            int current = q.poll();
            int currentCount = visited[current];
            
            if (current == M) {
                System.out.println(currentCount);
                br.close();
                return;
            }
            
            for (int move : moves) {
                int next = current + move;
                
                if (next >= 0 && next <= MAX_POS && visited[next] == -1) {
                    visited[next] = currentCount + 1;
                    q.offer(next);
                }
            }
            
            int nextA = current * A;
            int nextB = current * B;
            
            if (nextA <= MAX_POS && visited[nextA] == -1) {
                visited[nextA] = currentCount + 1;
                q.offer(nextA);
            }
            
            if (nextB <= MAX_POS && visited[nextB] == -1) {
                visited[nextB] = currentCount + 1;
                q.offer(nextB);
            }
        }

        /* ==========output========== */
        // 항상 도달 가능하므로 여기에 도달하지 않음
    }
}
