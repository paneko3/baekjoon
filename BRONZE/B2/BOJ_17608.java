// BOJ_17608_막대기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_17608 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];
        for(int i=0;i<N;i++){
            num[i] = Integer.parseInt(br.readLine());
        }
        /* ==========sol========== */
        int result=1;
        int max = num[N-1];
        for(int i=N-1;i>=0;i--){
            if(max<num[i]){
                max = num[i];
                result++;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
