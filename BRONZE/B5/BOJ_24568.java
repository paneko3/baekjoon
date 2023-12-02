// BOJ_24568_Cupcake Party

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_24568 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int R = Integer.parseInt(br.readLine());
        int S = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        /* ==========output========== */
        System.out.println(8*R+3*S-28);
        br.close();
    }
}