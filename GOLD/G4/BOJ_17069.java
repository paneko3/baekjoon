// BOJ_17069_파이프 옮기기 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_17069 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[][] map = new int[N+1][N+1];
        for(int i=1;i<=N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<=N;j++){
                map[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        /* ==========sol========== */
        long[][][] dp = new long[N+1][N+1][3];
        dp[1][2][0]=1;
        for(int i=1;i<=N;i++){
            for(int j=3;j<=N;j++){
                if(map[i][j]==1){
                    continue;
                }
                dp[i][j][0]=dp[i][j-1][0]+dp[i][j-1][2];
                if(i==1){
                    continue;
                }
                dp[i][j][1]=dp[i-1][j][1]+dp[i-1][j][2];
                if(map[i-1][j]==1||map[i][j-1]==1){
                    continue;
                }
                dp[i][j][2]=dp[i-1][j-1][0]+dp[i-1][j-1][1]+dp[i-1][j-1][2];
            }
        }
        /* ==========output========== */
        System.out.println(dp[N][N][0]+dp[N][N][1]+dp[N][N][2]);
        br.close();
    }
}