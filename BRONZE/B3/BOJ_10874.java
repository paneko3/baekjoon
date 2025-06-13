// BOJ_10874_이교수님의_시험

import java.io.*;
import java.util.*;

public class BOJ_10874 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> result = new ArrayList<>();

        /* ==========sol========== */
        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            boolean perfect = true;
            for (int j = 1; j <= 10; j++) {
                int ans = Integer.parseInt(st.nextToken());
                if (ans != ((j - 1) % 5 + 1)) {
                    perfect = false;
                    break;
                }
            }
            if (perfect) {
                result.add(i);
            }
        }

        /* ==========output========== */
        for (int x : result) {
            System.out.println(x);
        }
    }
}
