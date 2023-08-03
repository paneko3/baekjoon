// BOJ_20499_Darius님 한타 안 함?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_20499 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        /* ==========sol========== */
        String[] strings = str.split("/");
        int K = Integer.parseInt(strings[0]);
        int D = Integer.parseInt(strings[1]);
        int A = Integer.parseInt(strings[2]);
        /* ==========output========== */
        System.out.println(K+A<D||D==0?"hasu":"gosu");
        br.close();
    }
}