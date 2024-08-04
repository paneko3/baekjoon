// BOJ_23303_이 문제는 D2 입니다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_23303 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        /* ==========sol========== */
        /* ==========output========== */
        System.out.println((str.contains("D2")||str.contains("d2"))?"D2":"unrated");
        br.close();
    }
}