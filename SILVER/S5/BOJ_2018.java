// BOJ_2018_수들의 합 5

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2018 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int result = 0;
        for(int i=1;i<=N;i++){
            int sum = 0;
            for(int j=i;j<=N;j++){
                sum+=j;
                if(sum>N){
                    break;
                }else if(sum==N){
                    result++;
                    break;
                }
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}