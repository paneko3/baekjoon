// BOJ_9009_피보나치

import java.io.*;
import java.util.*;

public class BOJ_9009 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        list.add(0); list.add(1);
        for (int i = 2; ; i++) {
            int next = list.get(i - 1) + list.get(i - 2);
            if (next > 1000000000) { break; }
            list.add(next);
        }
        /* ==========sol========== */
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            Stack<Integer> stack = new Stack<>();
            for (int j = list.size() - 1; j >= 1; j--) {
                if (list.get(j) <= n) {
                    n -= list.get(j);
                    stack.push(list.get(j));
                }
                if (n == 0) { break; }
            }
            /* ==========output========== */
            while (!stack.isEmpty()) { sb.append(stack.pop()).append(" "); }
            sb.append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}
