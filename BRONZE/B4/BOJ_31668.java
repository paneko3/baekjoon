// BOJ_31668_특별한 가지

import java.io.*;
import java.util.*;

public class BOJ_31668 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        /* ==========sol========== */
        int numGimbap = m / n;
        int result = numGimbap * k;

        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
