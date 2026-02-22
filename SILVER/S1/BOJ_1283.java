// BOJ_1283_단축키 지정

import java.io.*;
import java.util.*;

public class BOJ_1283 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[] check = new boolean[26];
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            String[] arr = s.split(" ");
            boolean find = false;
            /* ==========sol========== */
            for (int j = 0; j < arr.length; j++) {
                int c = Character.toLowerCase(arr[j].charAt(0)) - 'a';
                if (!check[c]) {
                    check[c] = true; find = true;
                    for (int k = 0; k < arr.length; k++) {
                        if (j == k) { result.append("[").append(arr[k].charAt(0)).append("]").append(arr[k].substring(1)); }
                        else { result.append(arr[k]); }
                        if (k < arr.length - 1) { result.append(" "); }
                    }
                    result.append("\n"); break;
                }
            }
            if (!find) {
                for (int j = 0; j < s.length(); j++) {
                    char cur = s.charAt(j);
                    if (cur != ' ' && !check[Character.toLowerCase(cur) - 'a']) {
                        check[Character.toLowerCase(cur) - 'a'] = true; find = true;
                        result.append(s.substring(0, j)).append("[").append(cur).append("]").append(s.substring(j + 1)).append("\n");
                        break;
                    }
                }
            }
            if (!find) { result.append(s).append("\n"); }
        }
        /* ==========output========== */
        System.out.print(result);
        br.close();
    }
}
