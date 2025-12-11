// BOJ_30030_스위트콘 가격 구하기

import java.io.*;
import java.util.*;

public class BOJ_30030 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int result = b * 10 / 11;
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
