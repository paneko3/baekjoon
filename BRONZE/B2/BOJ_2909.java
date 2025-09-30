// BOJ_2909_캔디 구매

import java.io.*;
import java.util.*;

public class BOJ_2909 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long C = Long.parseLong(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        /* ==========sol========== */
        long powerOfTen = 1;
        for (int i = 0; i < K; i++) {
            powerOfTen *= 10;
        }

        long result = (C + powerOfTen / 2) / powerOfTen * powerOfTen;

        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
