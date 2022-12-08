// BOJ_7567_그릇

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_7567 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        /* ==========sol========== */
        int result= str.length()*10;
        char pre = str.charAt(0);
        for(int i=1;i<str.length();i++){
            if(pre==str.charAt(i)){
                result-=5;
            }
            pre=str.charAt(i);
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
