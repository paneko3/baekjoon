// BOJ_13702_이상한 술집

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_13702 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        long right = 1;
        long left = 1;
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(br.readLine());
            right=Math.max(right,arr[i]);
        }
        /* ==========sol========== */
        while (left<=right){
            long mid = (left+right)/2;
            int count = 0;
            for(int i=0;i<N;i++){
                count+=arr[i]/mid;
            }
            if(count>=K){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        /* ==========output========== */
        System.out.println(right);
        br.close();
    }
}