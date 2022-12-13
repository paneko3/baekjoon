// BOJ_11066_파일 합치기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11066 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int test_case=1;test_case<=T;test_case++){
            /* ==========input========== */
            int K = Integer.parseInt(br.readLine());
            int[] num = new int[K+1];
            int[] sum = new int[K+1];
            int[][] dp = new int[K+1][K+1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=1;i<=K;i++){
                num[i]=Integer.parseInt(st.nextToken());
                sum[i]=sum[i-1]+num[i];
            }
            /* ==========sol========== */
            for(int i=1;i<=K;i++){
                for(int j=1;j<=K-i;j++){
                    int temp = j+i;
                    dp[j][temp]=Integer.MAX_VALUE;
                    for(int k = j;k<temp;k++){
                        dp[j][temp]=Math.min(dp[j][temp],dp[j][k]+dp[k+1][temp]+sum[temp]-sum[j-1]);
                    }
                }
            }
            /* ==========output========== */
            System.out.println(dp[1][K]);
        }
        br.close();
    }
}
