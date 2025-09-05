// BOJ_15051_Máquina de café

import java.io.*;
import java.util.*;

public class BOJ_15051 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a1 = Integer.parseInt(br.readLine());
        int a2 = Integer.parseInt(br.readLine());
        int a3 = Integer.parseInt(br.readLine());

        /* ==========sol========== */
        int time1 = (a2 * 2) + (a3 * 4);
        int time2 = (a1 * 2) + (a3 * 2);
        int time3 = (a1 * 4) + (a2 * 2);
        int result = Math.min(time1, Math.min(time2, time3));

        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
