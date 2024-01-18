// BOJ_2999_비밀 이메일

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2999 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = str.length();
        /* ==========sol========== */
        int R = 1;
        for(int i=(int)Math.sqrt(N);i>=1;i--){
            if(N%i==0){
                R = i;
                break;
            }
        }
        int C = N/R;
        /* ==========output========== */
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                System.out.print(str.charAt(R*j+i));
            }
        }
        br.close();
    }
}