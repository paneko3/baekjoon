// BOJ_2721_삼각수의 합

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            /* ==========input========== */
            int N = Integer.parseInt(br.readLine());
            /* ==========sol========== */
            int result = 0;
            for(int j=1;j<=N;j++){
                result+=j*(j+1)*(j+2)/2;
            }
            /* ==========output========== */
            System.out.println(result);
        }
        br.close();
    }
}