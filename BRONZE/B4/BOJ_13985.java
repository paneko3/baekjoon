// BOJ_13985_Equality

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_13985 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        /* ==========sol========== */
        String[] tokens = str.split(" ");
        int a = Integer.parseInt(tokens[0]);
        int b = Integer.parseInt(tokens[2]);
        int c = Integer.parseInt(tokens[4]);
        /* ==========output========== */
        System.out.println(a+b==c?"YES":"NO");
        br.close();
    }
}