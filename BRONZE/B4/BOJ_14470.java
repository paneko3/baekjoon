// BOJ_14470_전자레인지

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_14470 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        int E = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int result = 0;
        if(A<0){
            result+=C*(-A);
            result+=B*E;
        }else {
            result+=(B-A)*E;
        }
        if(A<=0){
            result+=D;
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}