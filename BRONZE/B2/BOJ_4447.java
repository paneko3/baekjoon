// BOJ_4447_좋은놈 나쁜놈

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4447 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            /* ==========input========== */
            String str = br.readLine();
            /* ==========sol========== */
            int g = 0;
            int b = 0;
            for(int j=0;j<str.length();j++){
                if(str.toLowerCase().charAt(j)=='g'){
                    g++;
                }else if(str.toLowerCase().charAt(j)=='b'){
                    b++;
                }
            }
            /* ==========output========== */
            if(g>b){
                System.out.println(str + " is GOOD");
            }else if(g==b){
                System.out.println(str + " is NEUTRAL");
            }else {
                System.out.println(str + " is A BADDY");
            }
        }
        br.close();
    }
}