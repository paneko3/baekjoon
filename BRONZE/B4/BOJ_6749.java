// BOJ_6749_Next in line

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_6749 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Y = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        /* ==========output========== */
        System.out.println(2*M-Y);
        br.close();
    }
}