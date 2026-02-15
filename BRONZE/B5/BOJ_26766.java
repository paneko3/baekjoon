// BOJ_26766_Serca

import java.io.*;

public class BOJ_26766 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
        int n = Integer.parseInt(line.trim());

        /* ==========sol========== */
        StringBuilder heart = new StringBuilder();
        heart.append(" @@@   @@@ \n");
        heart.append("@   @ @   @\n");
        heart.append("@    @    @\n");
        heart.append("@         @\n");
        heart.append(" @       @ \n");
        heart.append("  @     @  \n");
        heart.append("   @   @   \n");
        heart.append("    @ @    \n");
        heart.append("     @     \n");

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(heart);
        }

        /* ==========output========== */
        System.out.print(result);
        br.close();
    }
}
