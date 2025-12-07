// BOJ_24082_立方体 (Cube)

import java.io.*;
import java.util.*;

public class BOJ_24082 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        long result = (long) n * n * n;
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
