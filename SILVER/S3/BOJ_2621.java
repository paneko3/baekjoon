// BOJ_2621_카드게임

import java.io.*;
import java.util.*;

public class BOJ_2621 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[10];
        Set<Character> colors = new HashSet<>();
        int maxNum = 0;

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            colors.add(st.nextToken().charAt(0));
            int n = Integer.parseInt(st.nextToken());
            nums[n]++;
            maxNum = Math.max(maxNum, n);
        }

        /* ==========sol========== */
        int p1 = 0, p2 = 0, triple = 0, quad = 0;
        boolean straight = false;
        
        int cnt = 0;
        for (int i = 1; i <= 9; i++) {
            if (nums[i] > 0) cnt++;
            else cnt = 0;
            if (cnt == 5) straight = true;

            if (nums[i] == 4) quad = i;
            if (nums[i] == 3) triple = i;
            if (nums[i] == 2) {
                if (p1 == 0) p1 = i;
                else p2 = i;
            }
        }

        int res = maxNum + 100;
        boolean flush = (colors.size() == 1);

        if (flush && straight) res = maxNum + 900;
        else if (quad > 0) res = quad + 800;
        else if (triple > 0 && p1 > 0) res = triple * 10 + p1 + 700;
        else if (flush) res = maxNum + 600;
        else if (straight) res = maxNum + 500;
        else if (triple > 0) res = triple + 400;
        else if (p2 > 0) res = Math.max(p1, p2) * 10 + Math.min(p1, p2) + 300;
        else if (p1 > 0) res = p1 + 200;

        /* ==========output========== */
        System.out.println(res);
        br.close();
    }
}
