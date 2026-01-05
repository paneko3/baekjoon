// BOJ_3474_교수가 된 현우

import java.io.*;
import java.util.*;

public class BOJ_3474 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            /* ==========input========== */
            int n = Integer.parseInt(br.readLine());

            /* ==========sol========== */
            int count = 0;
            // N!의 오른쪽 끝 0의 개수는 소인수 5의 개수와 같습니다.
            // 5의 배수, 25의 배수, 125의 배수... 의 개수를 누적합니다.
            while (n >= 5) {
                count += n / 5;
                n /= 5;
            }
            sb.append(count).append("\n");
        }
        /* ==========output========== */
        System.out.print(sb);
        br.close();
    }
}
