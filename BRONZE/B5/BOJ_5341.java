// BOJ_5341_Pyramids

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5341 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            /* ==========input========== */
            int N = Integer.parseInt(br.readLine());
            /* ==========sol========== */
            if(N==0){
                break;
            }
            int result = 0;
            for(int i=1;i<=N;i++){
                result+=i;
            }
            /* ==========output========== */
            System.out.println(result);
        }
        br.close();
    }
}