// BOJ_25704_출석 이벤트

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_25704 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int P = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int result = P;
        if(N>=20){
            result=Math.min(result,P*3/4);
        }
        if(N>=15){
            result=Math.min(result,P-2000);
        }
        if(N>=10){
            result=Math.min(result,P*9/10);
        }
        if(N>=5){
            result=Math.min(result,P-500);
        }
        /* ==========output========== */
        System.out.println(Math.max(result,0));
        br.close();
    }
}