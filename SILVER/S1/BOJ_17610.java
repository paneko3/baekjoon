// BOJ_17610_양팔저울

import java.io.*;
import java.util.*;

public class BOJ_17610 {
    static int k, s;
    static int[] arr;
    static boolean[] check;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        k = Integer.parseInt(br.readLine());
        arr = new int[k];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < k; i++) { arr[i] = Integer.parseInt(st.nextToken()); s += arr[i]; }
        /* ==========sol========== */
        check = new boolean[s + 1];
        dfs(0, 0);
        int result = 0;
        for (int i = 1; i <= s; i++) { if (!check[i]) { result++; } }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
    static void dfs(int idx, int val) {
        if (idx == k) {
            if (val > 0) { check[val] = true; }
            return;
        }
        dfs(idx + 1, val + arr[idx]);
        dfs(idx + 1, val - arr[idx]);
        dfs(idx + 1, val);
    }
}
