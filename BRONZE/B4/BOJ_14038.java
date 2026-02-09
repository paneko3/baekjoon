// BOJ_14038_Tournament Selection

import java.io.*;

public class BOJ_14038 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int wins = 0;

        for (int i = 0; i < 6; i++) {
            if (br.readLine().equals("W")) {
                wins++;
            }
        }

        /* ==========sol========== */
        int group;
        if (wins >= 5) group = 1;
        else if (wins >= 3) group = 2;
        else if (wins >= 1) group = 3;
        else group = -1;

        /* ==========output========== */
        System.out.println(group);
        br.close();
    }
}
