// BOJ_27327_時間 (Hour)

import java.io.*;

public class BOJ_27327 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        /* ==========sol========== */
        int result = x * 24;

        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
