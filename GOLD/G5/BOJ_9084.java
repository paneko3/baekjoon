// BOJ_9084_동전

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_9084 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int test_case=0;test_case<T;test_case++){
            /* ==========input========== */
            int N = Integer.parseInt(br.readLine());
            int[] cases = new int[N+1];
            st = new StringTokenizer(br.readLine());
            for(int i=1;i<=N;i++){
                cases[i]=Integer.parseInt(st.nextToken());
            }
            int M = Integer.parseInt(br.readLine());
            /* ==========sol========== */
            int[] dp = new int[M+1];
            for(int i=1;i<=N;i++){
                for(int j=1;j<=M;j++){
                    if(j-cases[i]>=1){
                        dp[j]=dp[j]+dp[j-cases[i]];
                    } else if(j-cases[i]==0){
                        dp[j]++;
                    }
                }
            }
            /* ==========output========== */
            System.out.println(dp[M]);
        }
        br.close();
    }
}