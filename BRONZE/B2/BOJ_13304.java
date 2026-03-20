// BOJ_13304_방 배정

import java.util.Scanner;

public class BOJ_13304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] groups = new int[5];

        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int y = sc.nextInt();

            if (y == 1 || y == 2) {
                groups[0]++;
            } else if (y == 3 || y == 4) {
                if (s == 0) groups[1]++;
                else groups[2]++;
            } else {
                if (s == 0) groups[3]++;
                else groups[4]++;
            }
        }

        /* ==========sol========== */
        int ans = 0;
        for (int count : groups) {
            ans += (count + k - 1) / k;
        }

        /* ==========output========== */
        System.out.println(ans);
        sc.close();
    }
}
