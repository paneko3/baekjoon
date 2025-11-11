// BOJ_15828_Router

import java.io.*;
import java.util.*;

public class BOJ_15828 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> routerBuffer = new LinkedList<>();

        /* ==========sol========== */
        
        int input;
        while (true) {
            input = Integer.parseInt(br.readLine());
            
            if (input == -1) {
                break;
            }
            
            if (input == 0) {
                if (!routerBuffer.isEmpty()) {
                    routerBuffer.poll();
                }
            } 
            else {
                if (routerBuffer.size() < N) {
                    routerBuffer.offer(input);
                }
            }
        }

        /* ==========output========== */
        StringBuilder sb = new StringBuilder();
        
        if (routerBuffer.isEmpty()) {
            System.out.println("empty");
        } else {
            for (int packet : routerBuffer) {
                sb.append(packet).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
        
        br.close();
    }
}
