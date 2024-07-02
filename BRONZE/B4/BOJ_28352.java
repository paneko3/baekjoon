// BOJ_28352_10!

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_28352 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        long a = 6;
        for(int i=11;i<=N;i++){
            a*=i;
        }
        /* ==========output========== */
        System.out.println(a);
        br.close();
    }
}