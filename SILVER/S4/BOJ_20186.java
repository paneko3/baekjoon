// BOJ_20186_수 고르기

import java.io.*;
import java.util.*;

public class BOJ_20186 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        Integer[] arr = new Integer[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        Arrays.sort(arr, Collections.reverseOrder());
        
        long sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        long penalty = (long) k * (k - 1) / 2;
        long result = sum - penalty;
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
