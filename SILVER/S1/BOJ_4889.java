// BOJ_4889_안정적인 문자열

import java.io.*;
import java.util.*;

public class BOJ_4889 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = 1;

        while (true) {
            /* ==========input========== */
            String line = br.readLine();
            if (line.contains("-")) break;

            /* ==========sol========== */
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < line.length(); i++) {
                char cur = line.charAt(i);
                if (cur == '{') {
                    stack.push(cur);
                } else {
                    if (!stack.isEmpty() && stack.peek() == '{') {
                        stack.pop();
                    } else {
                        stack.push(cur);
                    }
                }
            }

            int count = 0;
            while (!stack.isEmpty()) {
                char c1 = stack.pop();
                char c2 = stack.pop();

                if (c1 == c2) {
                    count += 1; 
                } else {
                    count += 2;
                }
            }

            sb.append(tc++).append(". ").append(count).append("\n");
        }
        /* ==========output========== */
        System.out.print(sb);
        br.close();
    }
}
