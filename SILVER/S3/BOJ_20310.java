// BOJ_20310_타노스

import java.io.*;
import java.util.*;

public class BOJ_20310 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        /* ==========sol========== */
        int len = S.length();
        int count0 = 0;
        int count1 = 0;
        
        for (int i = 0; i < len; i++) {
            if (S.charAt(i) == '0') {
                count0++;
            } else {
                count1++;
            }
        }
        
        int remove0 = count0 / 2;
        int remove1 = count1 / 2;
        
        StringBuilder sb = new StringBuilder(S);
        
        int removed0Count = 0;
        for (int i = len - 1; i >= 0; i--) {
            if (removed0Count == remove0) break;
            
            if (sb.charAt(i) == '0') {
                sb.deleteCharAt(i);
                removed0Count++;
            }
        }
        
        int currentLength = sb.length();
        int removed1Count = 0;
        for (int i = 0; i < currentLength; i++) {
            if (removed1Count == remove1) break;
            
            if (sb.charAt(i) == '1') {
                sb.deleteCharAt(i);
                removed1Count++;
                currentLength--; 
                i--;
            }
        }

        /* ==========output========== */
        System.out.println(sb.toString());
        br.close();
    }
}
