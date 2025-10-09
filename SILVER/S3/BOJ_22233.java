// BOJ_22233_가희와 키워드

import java.io.*;
import java.util.*;

public class BOJ_22233 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> memoKeywords = new HashSet<>();
        for (int i = 0; i < N; i++) {
            memoKeywords.add(br.readLine());
        }

        /* ==========sol========== */
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            String line = br.readLine();
            String[] usedKeywords = line.split(",");

            for (String keyword : usedKeywords) {
                memoKeywords.remove(keyword);
            }

            sb.append(memoKeywords.size()).append('\n');
        }

        /* ==========output========== */
        System.out.print(sb.toString());
        br.close();
    }
}
