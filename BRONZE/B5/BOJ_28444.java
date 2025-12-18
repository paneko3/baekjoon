// BOJ_28444_HI-ARC=?

import java.io.*;
import java.util.*;

public class BOJ_28444 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int i = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int result = h * i - a * r * c;
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
