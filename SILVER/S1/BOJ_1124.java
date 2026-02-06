// BOJ_1124_언더프라임

import java.io.*;
import java.util.*;

public class BOJ_1124 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        /* ==========sol========== */
        boolean[] isNotPrime = new boolean[b + 1];
        isNotPrime[0] = isNotPrime[1] = true;
        for (int i = 2; i * i <= b; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j <= b; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }

        int[] count = new int[b + 1];
        for (int i = 2; i <= b; i++) {
            if (count[i] == 0) {
                for (int j = i; j <= b; j += i) {
                    int temp = j;
                    while (temp % i == 0) {
                        count[j]++;
                        temp /= i;
                    }
                }
            }
        }

        int underPrimeCount = 0;
        for (int i = a; i <= b; i++) {
            if (!isNotPrime[count[i]]) {
                underPrimeCount++;
            }
        }

        /* ==========output========== */
        System.out.println(underPrimeCount);
        br.close();
    }
}
