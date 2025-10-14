// BOJ_1535_안녕

import java.io.*;
import java.util.*;

public class BOJ_1535 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine()); 
        
        StringTokenizer st_L = new StringTokenizer(br.readLine());
        StringTokenizer st_J = new StringTokenizer(br.readLine());

        /* ==========sol========== */
        int[] L = new int[N + 1];
        int[] J = new int[N + 1];
        
        for (int i = 1; i <= N; i++) {
            L[i] = Integer.parseInt(st_L.nextToken());
            J[i] = Integer.parseInt(st_J.nextToken());
        }
        
        int maxHealth = 99;
        
        int[] dp = new int[maxHealth + 1]; 
        
        for (int i = 1; i <= N; i++) {
            int loss = L[i];
            int gain = J[i];
            
            for (int c = maxHealth; c >= loss; c--) {
                dp[c] = Math.max(dp[c], dp[c - loss] + gain);
            }
        }
        
        int maxJoy = 0;
        for (int c = 0; c <= maxHealth; c++) {
            maxJoy = Math.max(maxJoy, dp[c]);
        }

        /* ==========output========== */
        System.out.println(maxJoy);
        br.close();
    }
}
