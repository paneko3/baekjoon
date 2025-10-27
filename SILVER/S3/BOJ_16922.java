// BOJ_16922_로마 숫자 만들기

import java.io.*;
import java.util.*;

public class BOJ_16922 {
    
    private static final int[] ROMAN_VALUES = {1, 5, 10, 50};
    private static int N;
    private static Set<Integer> possibleSums = new HashSet<>();

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        /* ==========sol========== */
        solve(0, 0, 0);

        /* ==========output========== */
        System.out.println(possibleSums.size());
        br.close();
    }
    
    private static void solve(int sum, int count, int lastIndex) {
        if (count == N) {
            possibleSums.add(sum);
            return;
        }

        for (int i = lastIndex; i < ROMAN_VALUES.length; i++) {
            solve(sum + ROMAN_VALUES[i], count + 1, i);
        }
    }
}
