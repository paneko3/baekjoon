// BOJ_15372_A Simple Problem

import java.io.*;
import java.util.*;

public class BOJ_15372 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < t; i++) {
            long n = Long.parseLong(br.readLine());
            result.append(n * n).append("\n");
        }
        /* ==========output========== */
        System.out.print(result);
        br.close();
    }
}
