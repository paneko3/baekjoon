// BOJ_13398_연속합 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_13398 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        int[] dp1 = new int[N];
        dp1[0]=arr[0];
        int result = dp1[0];
        for(int i=1;i<N;i++){
            dp1[i]=Math.max(dp1[i-1]+arr[i],arr[i]);
            result=Math.max(result,dp1[i]);
        }
        int[] dp2 = new int[N];
        dp2[N-1]=arr[N-1];
        for(int i=N-2;i>=0;i--){
            dp2[i]=Math.max(dp2[i+1]+arr[i],arr[i]);
        }

        for(int i=1;i<N-1;i++){
            result=Math.max(result,dp1[i-1]+dp2[i+1]);
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}