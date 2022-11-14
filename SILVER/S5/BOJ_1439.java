// BOJ_1439_뒤집기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1439 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str= br.readLine();
        /* ==========sol========== */
        int count0=0;
        int count1=0;
        char pre=str.charAt(0);
        if(pre=='0'){
            count0++;
        }else {
            count1++;
        }
        for(int i=1;i<str.length();i++){
            char now =str.charAt(i);
            if(pre!=now){
                if(now=='0'){
                    count0++;
                }else {
                    count1++;
                }
                pre=now;
            }
        }
        /* ==========output========== */
        System.out.println(Math.min(count0,count1));
        br.close();
    }
}
