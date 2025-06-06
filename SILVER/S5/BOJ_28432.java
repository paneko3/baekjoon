// BOJ_28432_끝말잇기

import java.io.*;
import java.util.*;

public class BOJ_28432 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        int idx = -1;
        Set<String> used = new HashSet<>();
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
            if (arr[i].equals("?")) idx = i;
            else used.add(arr[i]);
        }
        int M = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String s = br.readLine();
            if (!used.contains(s)) list.add(s);
        }

        /* ==========sol========== */
        for (String cand : list) {
            boolean ok = true;
            if (idx > 0 && !arr[idx - 1].equals("?")) {
                char pre = arr[idx - 1].charAt(arr[idx - 1].length() - 1);
                if (cand.charAt(0) != pre) ok = false;
            }
            if (idx < N - 1 && !arr[idx + 1].equals("?")) {
                char next = arr[idx + 1].charAt(0);
                if (cand.charAt(cand.length() - 1) != next) ok = false;
            }
            if (ok) {
                /* ==========output========== */
                System.out.println(cand);
                return;
            }
        }
    }
}
