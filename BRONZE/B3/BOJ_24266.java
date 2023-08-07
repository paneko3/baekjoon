// BOJ_24266_알고리즘 수업 - 알고리즘의 수행 시간 5

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_24266 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        /* ==========sol========== */
        /* ==========output========== */
        System.out.println(n*n*n);
        System.out.println(3);
        br.close();
    }
}