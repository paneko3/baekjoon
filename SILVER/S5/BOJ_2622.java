// BOJ_2622_삼각형만들기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2622 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int result = 0;
        for(int i=1;i<=N/3;i++){
            for(int j=i;j<=(N-i)/2;j++){
                int c = N-i-j;
                if(j>c){
                    break;
                }
                if(c<i+j){
                    result++;
                }
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}