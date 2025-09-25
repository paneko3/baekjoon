// BOJ_16466_콘서트

import java.io.*;
import java.util.*;

public class BOJ_16466 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        Set<Integer> soldTickets = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            soldTickets.add(Integer.parseInt(st.nextToken()));
        }

        /* ==========sol========== */
        int currentTicket = 1;
        while (true) {
            if (!soldTickets.contains(currentTicket)) {
                break;
            }
            currentTicket++;
        }
        
        /* ==========output========== */
        System.out.println(currentTicket);
        br.close();
    }
}
