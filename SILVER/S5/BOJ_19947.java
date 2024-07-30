// BOJ_19947_투자의 귀재 배주형

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_19947 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int[] dp = new int[Y+1];
        dp[0]=H;
        for(int i=1;i<=Y;i++){
            dp[i]=(int)(dp[i-1]*1.05);
            if (i >= 3) {
                dp[i]=Math.max((int)(dp[i-3]*1.2),dp[i]);
            }
            if (i >= 5) {
                dp[i]=Math.max((int)(dp[i-5]*1.35),dp[i]);
            }
        }
        /* ==========output========== */
        System.out.println(dp[Y]);
        br.close();
    }
}