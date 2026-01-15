// BOJ_26307_Correct

import java.io.*;
import java.util.*;

public class BOJ_26307 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hh = Integer.parseInt(st.nextToken());
        int mm = Integer.parseInt(st.nextToken());

        /* ==========sol========== */
        int startTotalMinutes = 9 * 60;
        int currentTotalMinutes = (hh * 60) + mm;
        int result = currentTotalMinutes - startTotalMinutes;

        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
