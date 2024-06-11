// BOJ_3151_합이 0

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_3151 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            A[i]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        long result = 0;
        Arrays.sort(A);
        for(int i=0;i<N;i++){
            if(A[i]>0){
                break;
            }
            int num = A[i];
            int left = i+1;
            int right = N-1;
            while (left<right){
                int sum = num + A[left] + A[right];
                if(sum==0){
                    int l = 1;
                    int r = 1;
                    if(A[left]==A[right]){
                        int n = right - left + 1;
                        result += n*(n-1)/2;
                        break;
                    }
                    while (A[left]==A[left+1]){
                        l++;
                        left++;
                    }
                    while (A[right]==A[right-1]){
                        r++;
                        right--;
                    }
                    result+=l*r;
                }
                if(sum>0){
                    right--;
                }else {
                    left++;
                }
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}