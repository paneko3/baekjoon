// BOJ_1254_팰린드롬 만들기

import java.io.*;
import java.util.*;

public class BOJ_1254 {

    private static boolean isPalindrome(String s, int start) {
        int left = start;
        int right = s.length() - 1;
        
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        /* ==========sol========== */
        int N = S.length();
        int minLength = 0;
        
        for (int start = 0; start < N; start++) {
            if (isPalindrome(S, start)) {
                minLength = N + start;
                break;
            }
        }

        /* ==========output========== */
        System.out.println(minLength);
        br.close();
    }
}
