// BOJ_14581_팬들에게 둘러싸인 홍준

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_14581 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(":fan::fan::fan:");
        System.out.println(":fan::"+ br.readLine() +"::fan:");
        System.out.println(":fan::fan::fan:");
        br.close();
    }
}