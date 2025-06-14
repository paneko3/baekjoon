// BOJ_30018_타슈

import java.io.*;
import java.util.*;

public class BOJ_30018 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] a = new int[N], b = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        /* ==========sol========== */
        int result = 0;
        for (int i = 0; i < N; i++) {
            if (b[i] < a[i]) {
                result += a[i] - b[i];
            }
        }

        /* ==========output========== */
        System.out.println(result);
    }
}
