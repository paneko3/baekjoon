// BOJ_2635_수 이어가기

import java.io.*;
import java.util.*;

public class BOJ_2635 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int maxLen = 0;
        List<Integer> result = new ArrayList<>();

        /* ==========sol========== */
        for (int b = 1; b <= a; b++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(a);
            temp.add(b);
            int i = 2;
            while (true) {
                int next = temp.get(i - 2) - temp.get(i - 1);
                if (next < 0) break;
                temp.add(next);
                i++;
            }
            if (temp.size() > maxLen) {
                maxLen = temp.size();
                result = temp;
            }
        }

        /* ==========output========== */
        System.out.println(maxLen);
        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}
