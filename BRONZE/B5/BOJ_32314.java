// BOJ_32314_Christmas Tree Adapter

import java.io.*;
import java.util.*;

public class BOJ_32314 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken()), v = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int result = 0;
        if (w / v >= a) { result = 1; }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
