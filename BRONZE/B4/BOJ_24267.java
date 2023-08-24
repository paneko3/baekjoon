// BOJ_24267_알고리즘 수업 - 알고리즘의 수행 시간 6

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_24267 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        System.out.println(N*(N-1)*(N-2)/6);
        System.out.println(3);
        br.close();
    }
}