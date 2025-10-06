// BOJ_2089_-2진수

import java.io.*;
import java.util.*;

public class BOJ_2089 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());

        /* ==========sol========== */
        if (N == 0) {
            System.out.println(0);
            return;
        }

        StringBuilder sb = new StringBuilder();
        
        while (N != 0) {
            long remainder = N % (-2);
            
            if (remainder == -1) {
                remainder = 1;
                N = N / (-2) + 1;
            } else {
                N = N / (-2);
            }
            
            sb.append(remainder);
        }

        /* ==========output========== */
        System.out.println(sb.reverse().toString());
        br.close();
    }
}
