// BOJ_17266_어두운 굴다리

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_17266 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] arr = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++) {
            arr[i]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        int result = 0;
        int left = 1;
        int right = N;
        while (left<=right){
            int mid = (left+right)/2;
            int temp = 0;
            boolean flag = false;
            for(int i=0;i<M;i++){
                if(arr[i]-mid<=temp){
                    temp = arr[i]+mid;
                }else {
                    flag = true;
                }
            }
            if(N-temp>0){
                flag=true;
            }else {
                flag=false;
            }
            if(flag){
                left = mid+1;
            }else {
                result=mid;
                right=mid-1;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}