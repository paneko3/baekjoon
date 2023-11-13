// BOJ_1253_좋다

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1253 {
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
        Arrays.sort(arr);
        int result = 0;
        for(int i=0;i<N;i++){
            int left = 0;
            int right = N-1;
            while (true){
                if(left==i){
                    left++;
                }else if(right==i){
                    right--;
                }
                if(left>=right){
                    break;
                }
                if(arr[i]==arr[left]+arr[right]){
                    result++;
                    break;
                }else if(arr[i]>arr[left]+arr[right]){
                    left++;
                }else {
                    right--;
                }
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}