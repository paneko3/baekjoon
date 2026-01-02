// BOJ_15903_카드 합체 놀이

import java.io.*;
import java.util.*;

public class BOJ_15903 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        PriorityQueue<Long> pq = new PriorityQueue<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            pq.add(Long.parseLong(st.nextToken()));
        }
        /* ==========sol========== */
        for (int i = 0; i < m; i++) {
            long a = pq.poll();
            long b = pq.poll();
            long sum = a + b;
            pq.add(sum);
            pq.add(sum);
        }
        long result = 0;
        while (!pq.isEmpty()) {
            result += pq.poll();
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
