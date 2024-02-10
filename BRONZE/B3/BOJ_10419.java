// BOJ_10419_지각

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10419 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            /* ==========input========== */
            int d = Integer.parseInt(br.readLine());
            /* ==========sol========== */
            int result = 0;
            for(int t=0;t<=10000;t++){
                if(t+t*t<=d){
                    result=t;
                }else {
                    break;
                }
            }
            /* ==========output========== */
            System.out.println(result);
        }
        br.close();
    }
}