// BOJ_11582_치킨 TOP N

import java.io.*;
import java.util.*;

public class BOJ_11582 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int k = Integer.parseInt(br.readLine());

        /* ==========sol========== */
        int groupSize = n / k;
        for (int i = 0; i < n; i += groupSize) {
            Arrays.sort(arr, i, i + groupSize);
        }

        /* ==========output========== */
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        br.close();
    }
}
