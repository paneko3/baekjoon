// BOJ_12101_1, 2, 3 더하기 2

import java.io.*;
import java.util.*;

public class BOJ_12101 {
    static int n, count;
    static long k;
    static String answer = "";

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Long.parseLong(st.nextToken());

        /* ==========sol========== */
        dfs(0, new ArrayList<>());

        /* ==========output========== */
        if (answer.equals("")) {
            System.out.println("-1");
        } else {
            System.out.println(answer);
        }
        br.close();
    }

    private static void dfs(int sum, List<Integer> list) {
        if (!answer.equals("")) return;

        if (sum > n) return;

        if (sum == n) {
            count++;
            if (count == k) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < list.size(); i++) {
                    sb.append(list.get(i));
                    if (i != list.size() - 1) sb.append("+");
                }
                answer = sb.toString();
            }
            return;
        }

        for (int i = 1; i <= 3; i++) {
            list.add(i);
            dfs(sum + i, list);
            list.remove(list.size() - 1);
        }
    }
}
