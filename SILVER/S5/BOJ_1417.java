// BOJ_1417_국회의원 선거

import java.io.*;
import java.util.*;

public class BOJ_1417 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        /* ==========sol========== */
        
        if (N == 1) {
            System.out.println(0);
            return;
        }

        int dasomVotes = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> rivals = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 1; i < N; i++) {
            rivals.add(Integer.parseInt(br.readLine()));
        }

        int bribeCount = 0;

        while (dasomVotes <= rivals.peek()) {
            int rivalMaxVotes = rivals.poll();
            
            dasomVotes++;
            rivalMaxVotes--;
            
            bribeCount++;
            
            rivals.add(rivalMaxVotes);
        }

        /* ==========output========== */
        System.out.println(bribeCount);
        br.close();
    }
}
