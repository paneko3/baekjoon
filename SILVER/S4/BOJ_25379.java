// BOJ_25379_피하자

import java.io.*;
import java.util.*;

public class BOJ_25379 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        long oddToLeftMoves = 0;
        long evenCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddToLeftMoves += evenCount;
            }
        }

        long evenToLeftMoves = 0;
        long oddCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            } else {
                evenToLeftMoves += oddCount;
            }
        }
        
        long result = Math.min(oddToLeftMoves, evenToLeftMoves);
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
