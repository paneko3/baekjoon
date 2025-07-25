// BOJ_11068_회문인 수

import java.io.*;
import java.util.*;

public class BOJ_11068 {

    public static List<Integer> convertToBase(int n, int b) {
        List<Integer> list = new ArrayList<>();
        while (n > 0) {
            list.add(n % b);
            n /= b;
        }
        return list;
    }

    public static boolean isPalindrome(List<Integer> list) {
        int len = list.size();
        for (int i = 0; i < len / 2; i++) {
            if (!list.get(i).equals(list.get(len - 1 - i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            boolean found = false;
            for (int b = 2; b <= 64; b++) {
                List<Integer> converted = convertToBase(n, b);
                if (isPalindrome(converted)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                result.append("1\n");
            } else {
                result.append("0\n");
            }
        }
        /* ==========output========== */
        System.out.print(result);
        br.close();
    }
}
