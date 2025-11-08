// BOJ_8949_대충 더해

import java.io.*;
import java.util.*;

public class BOJ_8949 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String A_str = st.nextToken();
        String B_str = st.nextToken();

        /* ==========sol========== */
        
        int maxLen = Math.max(A_str.length(), B_str.length());
        
        A_str = String.format("%" + maxLen + "s", A_str).replace(' ', '0');
        B_str = String.format("%" + maxLen + "s", B_str).replace(' ', '0');
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = maxLen - 1; i >= 0; i--) {
            int digitA = A_str.charAt(i) - '0';
            int digitB = B_str.charAt(i) - '0';
            
            int sum = digitA + digitB;
            
            sb.insert(0, sum);
        }
        
        String result = sb.toString();

        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
