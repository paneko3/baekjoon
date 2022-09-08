// BOJ_11057_오르막 수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11057 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int[][] dp = new int[N+1][10];
        for(int i=0;i<=9;i++){
            dp[1][i]=1;
        }
        for(int i=2;i<=N;i++){
            int sum=0;
            for(int j=9;j>=0;j--){
                sum+=dp[i-1][j]%10007;
                dp[i][j]=sum;
            }
        }
        int result=0;
        for(int i=0;i<=9;i++){
            result+=dp[N][i]%10007;
        }
        /* ==========output========== */
        System.out.println(result%10007);
        br.close();
    }
}
