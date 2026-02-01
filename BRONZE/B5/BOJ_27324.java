// BOJ_27324_ゾロ目 (Same Numbers)

import java.io.*;

public class BOJ_27324 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        /* ==========sol========== */
        int ten = n / 10;
        int one = n % 10;
        int result = (ten == one) ? 1 : 0;

        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
