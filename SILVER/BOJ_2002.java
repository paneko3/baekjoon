// BOJ_2002_추월

import java.io.*;
import java.util.*;

public class BOJ_2002 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(br.readLine(), i);
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = map.get(br.readLine());
        }

        /* ==========sol========== */
        int result = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    result++;
                    break;
                }
            }
        }

        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
