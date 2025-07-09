// BOJ_14568_사탕과_규칙

import java.io.*;

public class BOJ_14568 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int result = 0;

        /* ==========sol========== */
        for (int A = 2; A <= N - 2; A += 2) { // 택희 A는 짝수, 최소 1 이상이지만 짝수니까 2부터
            for (int B = 1; B <= N - A - 1; B++) { // 영훈 B는 1 이상
                int C = N - A - B;
                if (C <= 0) continue;
                if (C >= B + 2) result++;
            }
        }

        /* ==========output========== */
        System.out.println(result);
    }
}
