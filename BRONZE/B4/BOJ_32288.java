// BOJ_32288_바코드 닉네임

import java.io.*;
import java.util.*;

public class BOJ_32288 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String S = br.readLine();
        
        /* ==========sol========== */
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char c = S.charAt(i);
            if (c == 'l') {
                result.append('L');
            } else {
                result.append('i');
            }
        }
        
        /* ==========output========== */
        System.out.println(result.toString());
        br.close();
    }
}
