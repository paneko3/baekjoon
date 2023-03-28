// BOJ_2720_세탁소 사장 동혁

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int test_case=1;test_case<=T;test_case++){
            /* ==========input========== */
            int C = Integer.parseInt(br.readLine());
            /* ==========sol========== */
            /* ==========output========== */
            System.out.print(C/25 + " ");
            C %= 25;
            System.out.print(C/10 + " ");
            C %= 10;
            System.out.print(C/5 + " ");
            C %= 5;
            System.out.println(C + " ");
        }
        br.close();
    }
}
