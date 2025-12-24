// BOJ_20529_가장 가까운 세 사람의 심리적 거리

import java.io.*;
import java.util.*;

public class BOJ_20529 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            /* ==========input========== */
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) { arr[i] = st.nextToken(); }
            /* ==========sol========== */
            if (n > 32) {
                System.out.println(0);
                continue;
            }
            int result = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    for (int k = j + 1; k < n; k++) {
                        int dist = getDist(arr[i], arr[j]) + getDist(arr[j], arr[k]) + getDist(arr[i], arr[k]);
                        result = Math.min(result, dist);
                    }
                }
            }
            /* ==========output========== */
            System.out.println(result);
        }
        br.close();
    }

    static int getDist(String s1, String s2) {
        int cnt = 0;
        for (int i = 0; i < 4; i++) {
            if (s1.charAt(i) != s2.charAt(i)) { cnt++; }
        }
        return cnt;
    }
}
