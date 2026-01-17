// BOJ_32951_AI 선도대학

import java.io.*;
import java.util.*;

public class BOJ_32951 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        /* ==========sol========== */
        int result = n - 2024;

        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
