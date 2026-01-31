// BOJ_31654_Adding Trouble

import java.io.*;
import java.util.*;

public class BOJ_31654 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());

        /* ==========sol========== */
        String result = (a + b == c) ? "correct!" : "wrong!";

        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
