// BOJ_13015_별 찍기 - 23

import java.io.*;
import java.util.*;

public class BOJ_13015 {

    private static void appendChars(StringBuilder sb, char c, int count) {
        for (int i = 0; i < count; i++) {
            sb.append(c);
        }
    }

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        /* ==========sol========== */
        StringBuilder sb = new StringBuilder();
        int H = 2 * N - 1;

        for (int i = 1; i <= H; i++) {
            int r = i;
            if (i > N) {
                r = (2 * N) - i;
            }

            if (r == 1) {
                appendChars(sb, '*', N);
                appendChars(sb, ' ', (2 * N) - 3);
                appendChars(sb, '*', N);
            } else if (r == N) {
                appendChars(sb, ' ', N - 1);
                appendChars(sb, '*', 1);
                appendChars(sb, ' ', N - 2);
                appendChars(sb, '*', 1);
                appendChars(sb, ' ', N - 2);
                appendChars(sb, '*', 1);
            } else {
                appendChars(sb, ' ', r - 1);
                appendChars(sb, '*', 1);
                appendChars(sb, ' ', N - 2);
                appendChars(sb, '*', 1);
                appendChars(sb, ' ', (2 * N - 1) - (2 * r));
                appendChars(sb, '*', 1);
                appendChars(sb, ' ', N - 2);
                appendChars(sb, '*', 1);
            }
            
            sb.append('\n');
        }

        /* ==========output========== */
        System.out.print(sb.toString());
        br.close();
    }
}
