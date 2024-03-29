// BOJ_1300_K번째 수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1300 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        long left = 1;
        long right = k;
        while (left<right){
            long mid =(left+right)/2;
            long count=0;
            for(int i=1;i<=N;i++){
                count+=Math.min(mid/i,N);
            }
            if(k<=count){
                right=mid;
            }else {
                left=mid+1;
            }
        }
        /* ==========output========== */
        System.out.println(left);
        br.close();
    }
}
