// BOJ_10025_게으른 백곰

import java.io.*;
import java.util.*;

public class BOJ_10025 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] bucket = new int[1000001];
        int maxCoord = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int g = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            bucket[x] = g;
            if (x > maxCoord) maxCoord = x;
        }
        /* ==========sol========== */
        long currentSum = 0;
        long maxSum = 0;
        int windowSize = 2 * k + 1;

        for (int i = 0; i < Math.min(maxCoord + 1, windowSize); i++) {
            currentSum += bucket[i];
        }
        maxSum = currentSum;

        for (int i = windowSize; i <= maxCoord; i++) {
            currentSum += bucket[i];
            currentSum -= bucket[i - windowSize];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        /* ==========output========== */
        System.out.println(maxSum);
        br.close();
    }
}
