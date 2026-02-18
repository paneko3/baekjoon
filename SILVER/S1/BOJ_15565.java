// BOJ_15565_귀여운 라이언

import java.io.*;
import java.util.*;

public class BOJ_15565 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) { if (Integer.parseInt(st.nextToken()) == 1) { list.add(i); } }
        /* ==========sol========== */
        int result = Integer.MAX_VALUE;
        if (list.size() < k) { result = -1; }
        else {
            for (int i = 0; i <= list.size() - k; i++) {
                int dist = list.get(i + k - 1) - list.get(i) + 1;
                if (dist < result) { result = dist; }
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
