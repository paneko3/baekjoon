// BOJ_8558_Silnia

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_8558 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 1;
        /* ==========sol========== */
        for(int i=1;i<=N;i++){
            result=(result*i)%10;
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}