// BOJ_13301_타일 장식물

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_13301 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        if(N==1){
            System.out.println(4);
            return;
        }
        long[] fibo = new long[N+1];
        fibo[1]=1;
        fibo[2]=1;
        for(int i=3;i<=N;i++){
            fibo[i]=fibo[i-1]+fibo[i-2];
        }
        /* ==========output========== */
        System.out.println(4*fibo[N]+2*fibo[N-1]);
        br.close();
    }
}