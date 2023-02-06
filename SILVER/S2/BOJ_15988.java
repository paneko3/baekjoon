// BOJ_15988_1, 2, 3 더하기 3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_15988 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        long[] num = new long[1000001];
        num[1]=1;
        num[2]=2;
        num[3]=4;
        for(int i=4;i<1000001;i++){
            num[i]=(num[i-1]+num[i-2]+num[i-3])%1000000009;
        }
        /* ==========output========== */
        for(int i =0;i<T;i++){
            System.out.println(num[Integer.parseInt(br.readLine())]);
        }
        br.close();
    }
}
