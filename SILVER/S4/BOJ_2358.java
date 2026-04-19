// BOJ_2358_평행선

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_2358 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /* ==========input========== */
        int n = Integer.parseInt(br.readLine());
        
        Map<Integer, Integer> xMap = new HashMap<>();
        Map<Integer, Integer> yMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            /* ==========sol========== */
            xMap.put(x, xMap.getOrDefault(x, 0) + 1);
            yMap.put(y, yMap.getOrDefault(y, 0) + 1);
        }

        int count = 0;

        for (int val : xMap.values()) {
            if (val >= 2) count++;
        }

        for (int val : yMap.values()) {
            if (val >= 2) count++;
        }

        /* ==========output========== */
        System.out.println(count);
        br.close();
    }
}
