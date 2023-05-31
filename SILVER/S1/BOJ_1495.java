// BOJ_1495_기타리스트

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_1495 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] dp = new int[M+1];
        Arrays.fill(dp,-1);
        dp[S]=0;
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            int dif = Integer.parseInt(st.nextToken());
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0;j<=M;j++){
                if(dp[j]==i){
                    int num1 = j+dif;
                    int num2 = j-dif;
                    if(0<=num1&&num1<=M){
                        list.add(num1);
                    }
                    if(0<=num2&&num2<=M){
                        list.add(num2);
                    }
                }
            }
            for(int num : list){
                dp[num]=i+1;
            }
        }
        int result = -1;
        for(int i=0;i<=M;i++){
            if(dp[i]==N){
                result=Math.max(result,i);
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}