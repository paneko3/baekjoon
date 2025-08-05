// BOJ_1769_3의 배수

import java.io.*;
import java.util.*;

public class BOJ_1769 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine();
        /* ==========sol========== */
        int count = 0;
        long sum = 0;
        if (x.length() > 1) {
            count++;
            for (char c : x.toCharArray()) {
                sum += c - '0';
            }
            while (sum >= 10) {
                count++;
                long tempSum = 0;
                while (sum > 0) {
                    tempSum += sum % 10;
                    sum /= 10;
                }
                sum = tempSum;
            }
        } else {
            sum = Long.parseLong(x);
        }

        String result;
        if (sum == 3 || sum == 6 || sum == 9) {
            result = "YES";
        } else {
            result = "NO";
        }
        /* ==========output========== */
        System.out.println(count);
        System.out.println(result);
        br.close();
    }
}
