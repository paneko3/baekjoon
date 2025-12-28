// BOJ_16198_에너지 모으기

import java.io.*;
import java.util.*;

public class BOJ_16198 {
    static int result = 0;

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) { list.add(Integer.parseInt(st.nextToken())); }
        /* ==========sol========== */
        dfs(list, 0);
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }

    static void dfs(ArrayList<Integer> list, int sum) {
        if (list.size() == 2) {
            result = Math.max(result, sum);
            return;
        }
        for (int i = 1; i < list.size() - 1; i++) {
            int target = list.get(i);
            int energy = list.get(i - 1) * list.get(i + 1);
            list.remove(i);
            dfs(list, sum + energy);
            list.add(i, target);
        }
    }
}
