// BOJ_32384_사랑은 고려대입니다

import java.io.*;
import java.util.*;

public class BOJ_32384 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        /* ==========sol========== */
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("LoveisKoreaUniversity").append(" ");
        }

        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
}
