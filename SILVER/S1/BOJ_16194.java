// BOJ_16194_카드 구매하기 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_16194 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] cards = new int[N+1];
        int[] dp = new int[N+1];
        for(int i=1;i<=N;i++){
            cards[i] = Integer.parseInt(st.nextToken());
            dp[i]=Integer.MAX_VALUE;
        }
        /* ==========sol========== */
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                dp[i]= Math.min(dp[i], dp[i-j] + cards[j]);
            }
        };
        /* ==========output========== */
        System.out.println(dp[N]);
        br.close();
    }
}
