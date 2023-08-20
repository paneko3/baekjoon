// BOJ_1284_집 주소

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1284 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            /* ==========input========== */
            String N = br.readLine();
            /* ==========sol========== */
            if(N.equals("0")){
                break;
            }
            int result = 1;
            for(int i=0;i<N.length();i++){
                int num = N.charAt(i)-'0';
                if(num==1){
                    result+=3;
                }else if(num==0){
                    result+=5;
                }else {
                    result+=4;
                }
            }
            /* ==========output========== */
            System.out.println(result);
        }
        br.close();
    }
}