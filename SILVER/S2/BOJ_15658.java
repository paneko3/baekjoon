// BOJ_15658_연산자 끼워넣기 (2)

import java.io.*;
import java.util.*;

public class BOJ_15658 {
    static int n;
    static int[] arr;
    static int[] ops = new int[4];
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) { arr[i] = Integer.parseInt(st.nextToken()); }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) { ops[i] = Integer.parseInt(st.nextToken()); }
        /* ==========sol========== */
        dfs(1, arr[0]);
        /* ==========output========== */
        System.out.println(max);
        System.out.println(min);
        br.close();
    }

    static void dfs(int idx, int sum) {
        if (idx == n) {
            max = Math.max(max, sum);
            min = Math.min(min, sum);
            return;
        }
        for (int i = 0; i < 4; i++) {
            if (ops[i] > 0) {
                ops[i]--;
                if (i == 0) { dfs(idx + 1, sum + arr[idx]); }
                else if (i == 1) { dfs(idx + 1, sum - arr[idx]); }
                else if (i == 2) { dfs(idx + 1, sum * arr[idx]); }
                else { dfs(idx + 1, sum / arr[idx]); }
                ops[i]++;
            }
        }
    }
}
