// BOJ_14626_ISBN

import java.io.*;

public class BOJ_14626 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String isbn = br.readLine();

        /* ==========sol========== */
        int sumT = 0;
        int missingWeight = 0;
        
        int[] weights = {1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1};

        for (int i = 0; i < 13; i++) {
            char c = isbn.charAt(i);
            int weight = weights[i];

            if (c == '*') {
                missingWeight = weight;
            } else {
                int digit = c - '0';
                sumT += digit * weight;
            }
        }

        int T_mod_10 = sumT % 10;
        
        int R = (10 - T_mod_10) % 10;
        
        int X = -1; 
        
        if (missingWeight == 1) {
            X = R;
        } else {
            X = (7 * R) % 10;
        }
        
        /* ==========output========== */
        System.out.println(X);
        br.close();
    }
}
