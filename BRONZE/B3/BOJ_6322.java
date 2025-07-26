// BOJ_6322_직각 삼각형의 두 변

import java.io.*;
import java.util.*;

public class BOJ_6322 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int testCase = 1;
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double a = Double.parseDouble(st.nextToken());
            double b = Double.parseDouble(st.nextToken());
            double c = Double.parseDouble(st.nextToken());
            if (a == 0 && b == 0 && c == 0) break;
            /* ==========sol========== */
            result.append("Triangle #").append(testCase).append("\n");
            if (a == -1) {
                if (c <= b) {
                    result.append("Impossible.\n");
                } else {
                    a = Math.sqrt((c * c) - (b * b));
                    result.append("a = ").append(String.format("%.3f", a)).append("\n");
                }
            } else if (b == -1) {
                if (c <= a) {
                    result.append("Impossible.\n");
                } else {
                    b = Math.sqrt((c * c) - (a * a));
                    result.append("b = ").append(String.format("%.3f", b)).append("\n");
                }
            } else {
                c = Math.sqrt((a * a) + (b * b));
                result.append("c = ").append(String.format("%.3f", c)).append("\n");
            }
            testCase++;
            result.append("\n");
        }
        /* ==========output========== */
        System.out.print(result);
        br.close();
    }
}
