// BOJ_5543_상근날드

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5543 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        a = Math.min(a,Integer.parseInt(br.readLine()));
        a = Math.min(a,Integer.parseInt(br.readLine()));
        int b = Integer.parseInt(br.readLine());
        b = Math.min(b,Integer.parseInt(br.readLine()));
        /* ==========output========== */
        System.out.println(a+b-50);
        br.close();
    }
}
