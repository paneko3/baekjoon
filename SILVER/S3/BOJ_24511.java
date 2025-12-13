// BOJ_24511_queuestack

import java.io.*;
import java.util.*;

public class BOJ_24511 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[] type = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            type[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        /* ==========sol========== */
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            int val = Integer.parseInt(st.nextToken());
            if (type[i] == 0) {
                deque.addFirst(val);
            }
        }
        
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < m; i++) {
            int c = Integer.parseInt(st.nextToken());
            deque.addLast(c);
            sb.append(deque.pollFirst()).append(" ");
        }
        
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
}
