// BOJ_1855_암호

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1855 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int L = str.length()/K;
        /* ==========sol========== */
        /* ==========output========== */
        for(int i=0;i<K;i++) {
            for(int j=0;j<L;j++) {
                System.out.print(str.charAt(j%2==0?j*K+i:j*K+K-1-i));
            }
        }
        br.close();
    }
}