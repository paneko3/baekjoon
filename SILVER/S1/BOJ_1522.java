// BOJ_1522_문자열 교환

import java.io.*;

public class BOJ_1522 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = s.length();

        /* ==========sol========== */
        int aCount = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'a') {
                aCount++;
            }
        }

        int minBCount = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int bCount = 0;
            for (int j = 0; j < aCount; j++) {
                int index = (i + j) % n;
                if (s.charAt(index) == 'b') {
                    bCount++;
                }
            }
            minBCount = Math.min(minBCount, bCount);
        }

        /* ==========output========== */
        System.out.println(minBCount);
        br.close();
    }
}
