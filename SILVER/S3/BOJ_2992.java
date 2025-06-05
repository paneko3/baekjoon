// BOJ_2992_크면서_작은_수

import java.io.*;
import java.util.*;

public class BOJ_2992 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();

        /* ==========sol========== */
        boolean found = false;
        int N = arr.length;
        for (int i = N - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                for (int j = N - 1; j > i; j--) {
                    if (arr[i] < arr[j]) {
                        char tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                        Arrays.sort(arr, i + 1, N);
                        found = true;
                        break;
                    }
                }
                break;
            }
        }

        /* ==========output========== */
        System.out.println(found ? new String(arr) : 0);
    }
}
