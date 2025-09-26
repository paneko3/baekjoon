// BOJ_21313_문어

import java.io.*;
import java.util.*;

public class BOJ_21313 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        /* ==========sol========== */
        StringBuilder result = new StringBuilder();
        
        int limit = (N % 2 == 0) ? N : N - 1;
        
        for (int i = 0; i < limit; i++) {
            if (i % 2 == 0) {
                result.append("1 ");
            } else {
                result.append("2 ");
            }
        }
        
        if (N % 2 != 0) {
            result.append("3");
        } else {
            result.setLength(result.length() - 1);
        }

        /* ==========output========== */
        System.out.println(result.toString());
        br.close();
    }
}
