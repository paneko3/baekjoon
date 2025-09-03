// BOJ_16504_종이접기

import java.io.*;
import java.util.*;

public class BOJ_16504 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long sum = 0;

        /* ==========sol========== */
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                sum += Integer.parseInt(st.nextToken());
            }
        }

        /* ==========output========== */
        System.out.println(sum);
        br.close();
    }
}
