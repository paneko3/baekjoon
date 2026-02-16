// BOJ_1342_행운의 문자열

import java.io.*;

public class BOJ_1342 {
    static int[] alphabet = new int[26];
    static int len;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        len = s.length();

        for (int i = 0; i < len; i++) {
            alphabet[s.charAt(i) - 'a']++;
        }

        /* ==========sol========== */
        backtracking(0, -1);

        /* ==========output========== */
        System.out.println(count);
        br.close();
    }

    private static void backtracking(int depth, int prev) {
        if (depth == len) {
            count++;
            return;
        }

        for (int i = 0; i < 26; i++) {
            if (alphabet[i] > 0 && i != prev) {
                alphabet[i]--;
                backtracking(depth + 1, i);
                alphabet[i]++;
            }
        }
    }
}
