// BOJ_2526_싸이클

import java.io.*;
import java.util.*;

public class BOJ_2526 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int[] check = new int[p];
        int curr = n;
        int result = 0;
        for (int i = 1; ; i++) {
            curr = (curr * n) % p;
            if (check[curr] != 0) {
                result = i - check[curr];
                break;
            }
            check[curr] = i;
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
