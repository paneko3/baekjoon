// BOJ_6131_완전 제곱수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_6131 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int result = 0;
        for(int i=1;i<=1000;i++){
            for(int j=i+1;j<=1000;j++){
                if (j*j-i*i>N){
                    break;
                }else if (j*j-i*i==N){
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