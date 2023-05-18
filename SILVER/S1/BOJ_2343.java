// BOJ_2343_기타 레슨

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2343 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] num = new int[N+1];
        st = new StringTokenizer(br.readLine());
        int max = 0;
        int sum = 0;
        for(int i=1;i<=N;i++){
            num[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max,num[i]);
            sum+=num[i];
        }
        /* ==========sol========== */
        int left=max;
        int right=sum;
        while (left<=right){
            int mid = (left+right)/2;
            int count = 0;
            int temp =0;
            for(int i=1;i<=N;i++){
                temp+=num[i];
                if(temp>mid){
                    count++;
                    temp=num[i];
                }
            }

            if(count<M){
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        /* ==========output========== */
        System.out.println(left);
        br.close();
    }
}