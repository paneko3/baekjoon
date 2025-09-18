// BOJ_16172_나는 친구가 적다 (Large)

import java.io.*;
import java.util.*;

public class BOJ_16172 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine().replaceAll("[0-9]", "");
        String K = br.readLine();

        /* ==========sol========== */
        int result = (kmp(S, K)) ? 1 : 0;

        /* ==========output========== */
        System.out.println(result);
        br.close();
    }

    private static boolean kmp(String parent, String pattern) {
        int[] table = makeTable(pattern);

        int n1 = parent.length();
        int n2 = pattern.length();

        int j = 0;
        for (int i = 0; i < n1; i++) {
            while (j > 0 && parent.charAt(i) != pattern.charAt(j)) {
                j = table[j - 1];
            }
            if (parent.charAt(i) == pattern.charAt(j)) {
                if (j == n2 - 1) {
                    return true;
                } else {
                    j++;
                }
            }
        }
        return false;
    }

    private static int[] makeTable(String pattern) {
        int n = pattern.length();
        int[] table = new int[n];
        int j = 0;
        for (int i = 1; i < n; i++) {
            while (j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
                j = table[j - 1];
            }
            if (pattern.charAt(i) == pattern.charAt(j)) {
                j++;
                table[i] = j;
            }
        }
        return table;
    }
}
