// BOJ_2228_구간 나누기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2228 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N =Integer.parseInt(st.nextToken());
        int M =Integer.parseInt(st.nextToken());
        int[] num = new int[N+1];
        int[] sum = new int[N+1];
        for(int i=1;i<=N;i++){
            num[i]=Integer.parseInt(br.readLine());
            sum[i]=sum[i-1]+num[i];
        }
        /* ==========sol========== */
        int[][] dp= new int[N+1][M+1];
        for(int i=0;i<=N;i++){
            for(int j=1;j<=M;j++){
                dp[i][j]=-(int)1e9;
            }
        }
        dp[1][1]=num[1];
        for(int i=2;i<=N;i++){
            for(int j=1;j<=M;j++){
                dp[i][j]=dp[i-1][j];
                int min = 0;
                if(j==1){
                    min = -1;
                }
                for(int k = i-2;k>=min;k--){
                    if (k < 0) {
                        dp[i][j] = Math.max(dp[i][j],sum[i]);
                    }else {
                        dp[i][j] = Math.max(dp[i][j], dp[k][j-1]+sum[i]-sum[k+1]);
                    }
                }
            }
        }
        /* ==========output========== */
        System.out.println(dp[N][M]);
        br.close();
    }
}
