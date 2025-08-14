// BOJ_8710_Koszykarz

import java.io.*;
import java.util.*;

public class BOJ_8710 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long k = Long.parseLong(st.nextToken());
        long w = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        /* ==========sol========== */
        long diff = w - k;
        long result;
        if (diff <= 0) {
            result = 0;
        } else {
            result = (diff + m - 1) / m;
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
