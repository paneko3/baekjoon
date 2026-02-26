// BOJ_25418_정수 a를 k로 만들기

import java.io.*;
import java.util.*;

public class BOJ_25418 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int result = 0;
        for (; k > a; ) {
            if (k % 2 == 0 && k / 2 >= a) { k /= 2; }
            else { k -= 1; }
            result++;
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
