// BOJ_19602_Dog Treats

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_19602 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int S = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int L = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int result = 1*S+2*M+3*L;
        /* ==========output========== */
        System.out.println(result>=10?"happy":"sad");
        br.close();
    }
}
