// BOJ_21598_SciComLove

import java.io.*;

public class BOJ_21598 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        /* ==========sol========== */
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("SciComLove").append("\n");
        }

        /* ==========output========== */
        System.out.print(sb);
        br.close();
    }
}
