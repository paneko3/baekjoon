// BOJ_18353_병사 배치하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_18353 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] power = new int[N];
        int[] dp = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            power[i] = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        for(int i=1;i<N;i++)
            for(int j=0;j<=i;j++)
                if(power[i]<power[j])
                    dp[i]=Math.max(dp[i],dp[j]+1);
        Arrays.sort(dp);
        /* ==========output========== */
        System.out.println(N-dp[N-1]-1);
        br.close();
    }
}
