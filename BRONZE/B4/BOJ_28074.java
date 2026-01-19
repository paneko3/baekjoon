// BOJ_28074_모비스

import java.io.*;
import java.util.*;

public class BOJ_28074 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        /* ==========sol========== */
        boolean m = false, o = false, b = false, i = false, s_char = false;

        for (int j = 0; j < s.length(); j++) {
            char target = s.charAt(j);
            if (target == 'M') m = true;
            else if (target == 'O') o = true;
            else if (target == 'B') b = true;
            else if (target == 'I') i = true;
            else if (target == 'S') s_char = true;
        }

        String result = (m && o && b && i && s_char) ? "YES" : "NO";

        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
