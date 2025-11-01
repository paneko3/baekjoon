// BOJ_30214_An Easy-Peasy Problem

import java.io.*;
import java.util.*;

public class BOJ_30214 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int s1 = Integer.parseInt(st.nextToken());
        int s2 = Integer.parseInt(st.nextToken());

        /* ==========sol========== */
        
        String result;
        if (s1 * 2 >= s2) {
            result = "E";
        } else {
            result = "H";
        }

        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
