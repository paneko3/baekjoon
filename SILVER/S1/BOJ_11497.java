// BOJ_11497_통나무 건너뛰기

import java.io.*;
import java.util.*;

public class BOJ_11497 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int tc = 0; tc < T; tc++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
            /* ==========sol========== */
            Arrays.sort(arr);
            int result = 0;
            for (int i = 2; i < n; i++) {
                result = Math.max(result, arr[i] - arr[i - 2]);
            }
            sb.append(result).append("\n");
        }
        /* ==========output========== */
        System.out.print(sb);
        br.close();
    }
}
