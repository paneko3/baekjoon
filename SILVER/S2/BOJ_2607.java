// BOJ_2607_비슷한 단어

import java.io.*;
import java.util.*;

public class BOJ_2607 {

    private static int[] getCharCounts(String word) {
        int[] counts = new int[26];
        for (char c : word.toCharArray()) {
            counts[c - 'A']++;
        }
        return counts;
    }

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String W1 = br.readLine();
        int L1 = W1.length();
        int[] C1 = getCharCounts(W1);

        /* ==========sol========== */
        int similarCount = 0;

        for (int i = 0; i < N - 1; i++) {
            String W2 = br.readLine();
            int L2 = W2.length();
            int[] C2 = getCharCounts(W2);

            int lenDiff = Math.abs(L1 - L2);
            
            if (lenDiff >= 2) {
                continue;
            }

            int totalDiff = 0;
            for (int j = 0; j < 26; j++) {
                totalDiff += Math.abs(C1[j] - C2[j]);
            }
            
            if (lenDiff == 0) {
                if (totalDiff <= 2) {
                    similarCount++;
                }
            } 
            else if (lenDiff == 1) {
                if (totalDiff == 1) {
                    similarCount++;
                }
            }
        }

        /* ==========output========== */
        System.out.println(similarCount);
        br.close();
    }
}
