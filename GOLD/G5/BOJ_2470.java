// BOJ_2470_두 용액

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2470 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        int N=Integer.parseInt(br.readLine());
        int[] num = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            num[i]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        Arrays.sort(num);
        int leftIdx=0;
        int rightIdx=N-1;
        int left=num[leftIdx];
        int right=num[rightIdx];
        int min=Integer.MAX_VALUE;
        while(leftIdx<rightIdx){
            int sum = num[leftIdx]+num[rightIdx];
            if(Math.abs(sum)<min){
                min=Math.abs(sum);
                left=num[leftIdx];
                right=num[rightIdx];
            }
            if(sum>0){
                rightIdx--;
            }else {
                leftIdx++;
            }
        }
        /* ==========output========== */
        System.out.println(left + " " + right);
        br.close();
    }
}
