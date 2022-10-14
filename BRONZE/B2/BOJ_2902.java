// BOJ_2902_KMP는 왜 KMP일까?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2902 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str =br.readLine().split("-");
        /* ==========output========== */
        for (String s : str) {
            System.out.print(s.charAt(0));
        }
        br.close();
    }
}
