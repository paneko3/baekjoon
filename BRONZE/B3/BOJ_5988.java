// BOJ_5988_홀수일까 짝수일까

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            /* ==========input========== */
            String K = br.readLine();
            /* ==========sol========== */
            /* ==========output========== */
            System.out.println((K.charAt(K.length()-1)-'0')%2==0?"even":"odd");
        }
        br.close();
    }
}