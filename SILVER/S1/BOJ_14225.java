// BOJ_14225_부분수열의 합

import java.io.*;
import java.util.*;

public class BOJ_14225 {
    static int n;
    static int[] arr;
    static boolean[] check;

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        check = new boolean[2000001];
        dfs(0, 0);
        int result = 1;
        while (check[result]) {
            result++;
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }

    static void dfs(int depth, int sum) {
        if (depth == n) {
            check[sum] = true;
            return;
        }
        dfs(depth + 1, sum);
        dfs(depth + 1, sum + arr[depth]);
    }
}
