// BOJ_1793_타일링

import java.io.*;
import java.math.BigInteger;

public class BOJ_1793 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        /* ==========sol========== */
        BigInteger[] dp = new BigInteger[251];
        dp[0] = BigInteger.ONE;
        dp[1] = BigInteger.ONE;
        if (250 >= 2) {
            for (int i = 2; i <= 250; i++) {
                dp[i] = dp[i - 1].add(dp[i - 2].multiply(BigInteger.valueOf(2)));
            }
        }

        /* ==========output========== */
        String line;
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            int n = Integer.parseInt(line.trim());
            System.out.println(dp[n]);
        }
        br.close();
    }
}
