// BOJ_16943_숫자 재배치

import java.util.Scanner;

public class BOJ_16943 {
    static String aStr;
    static int b, ans = -1;
    static char[] aArr;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        aStr = sc.next();
        b = sc.nextInt();
        aArr = aStr.toCharArray();
        visited = new boolean[aArr.length];

        /* ==========sol========== */
        dfs("");

        /* ==========output========== */
        System.out.println(ans);
        sc.close();
    }

    static void dfs(String current) {
        if (current.length() == aArr.length) {
            int c = Integer.parseInt(current);
            if (c < b) {
                ans = Math.max(ans, c);
            }
            return;
        }

        for (int i = 0; i < aArr.length; i++) {
            if (visited[i]) continue;
            if (current.length() == 0 && aArr[i] == '0') continue;

            visited[i] = true;
            dfs(current + aArr[i]);
            visited[i] = false;
        }
    }
}
