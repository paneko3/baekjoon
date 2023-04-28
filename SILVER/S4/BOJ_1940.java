// BOJ_1940_주몽

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1940 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] num = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            num[i]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        Arrays.sort(num);
        int left=0;
        int right=N-1;
        int result=0;
        while (left<right){
            int a = num[left];
            int b = num[right];
            if(a+b==M){
                result++;
                left++;
                right--;
            }else if(a+b<M){
                left++;
            }else {
                right--;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}