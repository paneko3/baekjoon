// BOJ_3028_창영마을

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_3028 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        /* ==========sol========== */
        int result = 1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='A'){
                if(result==1){
                    result=2;
                }else if(result==2){
                    result=1;
                }
            }else if(str.charAt(i)=='B'){
                if(result==2){
                    result=3;
                }else if(result==3){
                    result=2;
                }
            }else {
                if(result==1){
                    result=3;
                }else if(result==3){
                    result=1;
                }
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}