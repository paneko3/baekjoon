// BOJ_5928_ContestTiming

import java.io.*;
import java.util.*;

public class BOJ_5928 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int D = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        /* ==========sol========== */
        // 시작 시각: 11일 11시 11분
        int start = (11 * 24 * 60) + (11 * 60) + 11;
        int end = (D * 24 * 60) + (H * 60) + M;
        int result = end - start;

        /* ==========output========== */
        System.out.println(result < 0 ? -1 : result);
    }
}
