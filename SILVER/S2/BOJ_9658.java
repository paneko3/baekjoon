// BOJ_9658_돌 게임 4

import java.io.*;
import java.util.*;

public class BOJ_9658 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        /* ==========sol========== */
        int[] dp = new int[1005];
        dp[1] = 0; 
        dp[2] = 1; 
        dp[3] = 0; 
        dp[4] = 1; 

        for (int i = 5; i <= n; i++) {
            if (dp[i - 1] == 0 || dp[i - 3] == 0 || dp[i - 4] == 0) {
                dp[i] = 1;
            } else {
                dp[i] = 0;
            }
        }

        /* ==========output========== */
        if (dp[n] == 1) {
            System.out.println("SK");
        } else {
            System.out.println("CY");
        }
        
        br.close();
    }
}
