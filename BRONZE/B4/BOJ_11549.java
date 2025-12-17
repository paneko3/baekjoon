// BOJ_11549_Identifying tea

import java.io.*;
import java.util.*;

public class BOJ_11549 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        /* ==========sol========== */
        int result = 0;
        for (int i = 0; i < 5; i++) {
            if (Integer.parseInt(st.nextToken()) == n) {
                result++;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
