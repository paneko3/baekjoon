// BOJ_24265_알고리즘 수업 - 알고리즘의 수행 시간 4

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_24265 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        /* ==========output========== */
        System.out.println(n*(n-1)/2);
        System.out.println(2);
        br.close();
    }
}