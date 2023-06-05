// BOJ_12738_가장 긴 증가하는 부분 수열 3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_12738 {
    static int[] num, dp;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        num = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            num[i]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        dp = new int[N];
        int result = 0;
        for(int i=0;i<N;i++){
            int idx = search(num[i],0,result,result+1);
            if(idx == -1){
                dp[result++]=num[i];
            }else {
                dp[idx]=num[i];
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
    static int search(int n, int left, int right, int size){
        int temp = 0;
        while (left <= right){
            int mid = (left+right)/2;
            if(n<=dp[mid]){
                temp = mid;
                right = mid - 1;
            }else {
                left = mid +1;
            }
        }
        if(left == size){
            return -1;
        }else {
            return temp;
        }
    }
}