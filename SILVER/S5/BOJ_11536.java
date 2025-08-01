// BOJ_11536_줄 세우기

import java.io.*;
import java.util.*;

public class BOJ_11536 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) arr[i] = br.readLine();
        /* ==========sol========== */
        boolean isIncreasing = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i].compareTo(arr[i + 1]) > 0) {
                isIncreasing = false;
                break;
            }
        }

        boolean isDecreasing = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i].compareTo(arr[i + 1]) < 0) {
                isDecreasing = false;
                break;
            }
        }

        String result;
        if (isIncreasing) {
            result = "INCREASING";
        } else if (isDecreasing) {
            result = "DECREASING";
        } else {
            result = "NEITHER";
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
