// BOJ_17362_수학은 체육과목 입니다 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_17362 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N % 8 == 0) {
            System.out.println(2);
        }else if(N % 4 == 3) {
            System.out.println(3);
        }else if(N % 8 == 6) {
            System.out.println(4);
        }else {
            System.out.println(N % 8);
        }
        br.close();
    }
}