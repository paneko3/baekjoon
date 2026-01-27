// BOJ_1141_접두사

import java.io.*;
import java.util.*;

public class BOJ_1141 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = br.readLine();
        }

        /* ==========sol========== */
        Arrays.sort(words, (s1, s2) -> s2.length() - s1.length());

        List<String> prefixFreeSet = new ArrayList<>();
        for (String word : words) {
            boolean isPrefix = false;
            for (String s : prefixFreeSet) {
                if (s.startsWith(word)) {
                    isPrefix = true;
                    break;
                }
            }
            if (!isPrefix) {
                prefixFreeSet.add(word);
            }
        }

        /* ==========output========== */
        System.out.println(prefixFreeSet.size());
        br.close();
    }
}
