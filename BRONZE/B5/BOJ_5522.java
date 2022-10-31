// BOJ_5522_카드 게임

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5522 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long result=0;
        for(int i=0;i<5;i++){
            result+=Long.parseLong(br.readLine());
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
