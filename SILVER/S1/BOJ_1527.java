// BOJ_1527_금민수의_개수

import java.io.*;

public class BOJ_1527 {
    static long A, B;
    static int result = 0;

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        A = Long.parseLong(input[0]);
        B = Long.parseLong(input[1]);

        /* ==========sol========== */
        dfs(0);

        /* ==========output========== */
        System.out.println(result);
    }

    static void dfs(long num) {
        if (num > B) return;
        if (num >= A) result++;
        dfs(num * 10 + 4);
        dfs(num * 10 + 7);
    }
}
