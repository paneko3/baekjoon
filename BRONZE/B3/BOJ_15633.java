// BOJ_15633_Fan Death

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_15633 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int result = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                result+=i;
            }
        }
        /* ==========output========== */
        System.out.println(result*5-24);
        br.close();
    }
}