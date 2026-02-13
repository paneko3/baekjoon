// BOJ_31429_SUAPC 2023 Summer

import java.io.*;

public class BOJ_31429 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        /* ==========sol========== */
        int[] problems = {0, 12, 11, 11, 10, 9, 9, 9, 8, 7, 6, 6};
        int[] penalties = {0, 1600, 894, 1327, 1311, 1004, 1178, 1357, 837, 1055, 556, 773};

        /* ==========output========== */
        System.out.println(problems[n] + " " + penalties[n]);
        br.close();
    }
}
