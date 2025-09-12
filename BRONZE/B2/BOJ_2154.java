// BOJ_2154_수 이어 쓰기 3

import java.io.*;
import java.util.*;

public class BOJ_2154 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        /* ==========sol========== */
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(i);
        }
        
        String nStr = String.valueOf(N);
        int result = sb.indexOf(nStr) + 1;
        
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
