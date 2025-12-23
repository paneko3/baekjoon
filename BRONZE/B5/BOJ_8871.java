// BOJ_8871_Zadanie próbne 2

import java.io.*;
import java.util.*;

public class BOJ_8871 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int min = (n + 1) * 2;
        int max = (n + 1) * 3;
        /* ==========output========== */
        System.out.println(min + " " + max);
        br.close();
    }
}
