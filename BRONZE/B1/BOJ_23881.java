// BOJ_23881_알고리즘 수업 - 선택 정렬 1

import java.io.*;
import java.util.*;

public class BOJ_23881 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        int[] a = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        int swapCount = 0;
        int result1 = -1;
        int result2 = -1;

        for (int last = n - 1; last > 0; last--) {
            int maxVal = a[last];
            int maxIdx = last;

            for (int i = 0; i < last; i++) {
                if (a[i] > maxVal) {
                    maxVal = a[i];
                    maxIdx = i;
                }
            }

            if (last != maxIdx) {
                swapCount++;
                int temp = a[last];
                a[last] = a[maxIdx];
                a[maxIdx] = temp;
                
                if (swapCount == k) {
                    result1 = a[maxIdx];
                    result2 = a[last];
                    break;
                }
            }
        }
        /* ==========output========== */
        if (result1 != -1) {
            if (result1 < result2) {
                System.out.println(result1 + " " + result2);
            } else {
                System.out.println(result2 + " " + result1);
            }
        } else {
            System.out.println("-1");
        }
        br.close();
    }
}
