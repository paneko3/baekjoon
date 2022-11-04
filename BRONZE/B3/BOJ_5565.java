// BOJ_5565_영수증

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5565 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result=Integer.parseInt(br.readLine());
        for(int i=0;i<9;i++){
            result-=Integer.parseInt(br.readLine());
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
