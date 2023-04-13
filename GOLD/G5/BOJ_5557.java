// BOJ_5557_1학년

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_5557 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            num[i]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        long[][] dp = new long[N][21];
        dp[0][num[0]]=1;
        int left, right;
        for(int i=1;i<N-1;i++){
            for(int j=0;j<=20;j++){
                if(dp[i-1][j]!=0){
                    left = j-num[i];
                    right = j+num[i];
                    if(left>=0&&left<=20){
                        dp[i][left]+=dp[i-1][j];
                    }
                    if(right>=0&&right<=20){
                        dp[i][right]+=dp[i-1][j];
                    }
                }
            }
        }
        /* ==========output========== */
        System.out.println(dp[N-2][num[N-1]]);
        br.close();
    }

}