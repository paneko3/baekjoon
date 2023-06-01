// BOJ_2846_오르막길

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2846 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] num = new int[N];
        for(int i=0;i<N;i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        int result = 0;
        int temp = 0;
        for(int i=1;i<N;i++){
            if(num[i-1]<num[i]){
                temp += num[i]-num[i-1];
            }else {
                temp = 0;
            }
            result = Math.max(result,temp);
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}