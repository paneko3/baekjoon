// BOJ_1337_올바른배열

import java.io.*;
import java.util.*;

public class BOJ_1337 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        /* ==========sol========== */
        Arrays.sort(arr);
        int max = 0;
        for (int i=0; i<N; i++) {
            int cnt = 0;
            for (int j=i; j<N; j++) {
                if (arr[j] - arr[i] < 5) {
                    cnt++;
                } else {
                    break;
                }
            }
            max = Math.max(max, cnt);
        }

        int result = 5 - max;

        /* ==========output========== */
        System.out.println(result);
    }
}
