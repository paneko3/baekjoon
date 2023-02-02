// BOJ_15894_수학은 체육과목 입니다

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_15894 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        /* ==========sol========== */
        /* ==========output========== */
        System.out.println(n*4);
        br.close();
    }
}
