// BOJ_14465_소가 길을 건너간 이유 5

import java.io.*;
import java.util.*;

public class BOJ_14465 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        boolean[] isBroken = new boolean[n + 1];
        for (int i = 0; i < b; i++) {
            isBroken[Integer.parseInt(br.readLine())] = true;
        }

        /* ==========sol========== */
        int currentBroken = 0;
        for (int i = 1; i <= k; i++) {
            if (isBroken[i]) {
                currentBroken++;
            }
        }

        int minRepair = currentBroken;

        for (int i = k + 1; i <= n; i++) {
            if (isBroken[i]) {
                currentBroken++;
            }
            if (isBroken[i - k]) {
                currentBroken--;
            }
            minRepair = Math.min(minRepair, currentBroken);
        }

        /* ==========output========== */
        System.out.println(minRepair);
        br.close();
    }
}
