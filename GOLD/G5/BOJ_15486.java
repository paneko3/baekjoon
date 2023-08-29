// BOJ_15486_퇴사 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15486 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[][] task = new int[N+2][2];
        for(int i=1;i<=N;i++){
            st = new StringTokenizer(br.readLine());
            task[i][0]=Integer.parseInt(st.nextToken());
            task[i][1]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        int[] dp = new int[N+2];
        int max = -1;
        for(int i=1;i<=N+1;i++){
            if(max<dp[i]){
                max = dp[i];
            }
            int temp = i + task[i][0];
            if(temp<N+2){
                dp[temp] = Math.max(dp[temp],max+task[i][1]);
            }
        }
        /* ==========output========== */
        System.out.println(dp[N+1]);
        br.close();
    }
}