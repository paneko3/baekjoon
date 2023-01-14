// BOJ_2229_조 짜기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2229 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1;i<=N;i++){
            num[i]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        int[] dp = new int[N+1];
        for(int i=1;i<=N;i++){
            int min = Integer.MAX_VALUE;
            int max = 0;
            for(int j=i;j>0;j--){
                max=Math.max(max,num[j]);
                min=Math.min(min,num[j]);
                dp[i]=Math.max(dp[i],max - min + dp[j-1]);
            }
        }
        /* ==========output========== */
        System.out.println(dp[N]);
        br.close();
    }
}
