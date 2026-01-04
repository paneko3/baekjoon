// BOJ_9659_돌 게임 5

import java.io.*;
import java.util.*;

public class BOJ_9659 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        /* ==========sol========== */
        String result = (n % 2 != 0) ? "SK" : "CY";
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
