// BOJ_14913_등차수열에서 항 번호 찾기

import java.io.*;
import java.util.*;

public class BOJ_14913 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        /* ==========sol========== */
        if ((k - a) % d == 0) {
            int n = (k - a) / d + 1;
            if (n >= 1) {
                System.out.println(n);
            } else {
                System.out.println("X");
            }
        } else {
            System.out.println("X");
        }
        
        /* ==========output========== */
        br.close();
    }
}
