// BOJ_30455_이제는 더 이상 물러날 곳이 없다

import java.io.*;
import java.util.*;

public class BOJ_30455 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        /* ==========sol========== */
        
        String winner;
        
        if (N % 2 == 0) {
            winner = "Duck";
        } else {
            winner = "Goose";
        }

        /* ==========output========== */
        System.out.println(winner);
        br.close();
    }
}
