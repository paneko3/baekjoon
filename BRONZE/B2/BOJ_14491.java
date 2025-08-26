// BOJ_14491_9진수

import java.io.*;
import java.util.*;

public class BOJ_14491 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        if (t == 0) {
            System.out.println(0);
            return;
        }

        StringBuilder sb = new StringBuilder();
        while (t > 0) {
            sb.append(t % 9);
            t /= 9;
        }

        String result = sb.reverse().toString();
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
