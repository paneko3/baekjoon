// BOJ_27465_소수가 아닌 수

import java.io.*;
import java.util.*;

public class BOJ_27465 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        /* ==========sol========== */
        int result = N;
        while (true) {
            if (isPrime(result)) {
                result++;
            } else {
                break;
            }
        }

        /* ==========output========== */
        System.out.println(result);
        br.close();
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
