// BOJ_5555_반지

import java.io.*;
import java.util.*;

public class BOJ_5555 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String target = br.readLine();
        int n = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int result = 0;
        for (int i = 0; i < n; i++) {
            String ring = br.readLine();
            String extendedRing = ring + ring; // 원형으로 연결된 문자열을 처리하기 위해 두 번 이어 붙임
            if (extendedRing.contains(target)) {
                result++;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
