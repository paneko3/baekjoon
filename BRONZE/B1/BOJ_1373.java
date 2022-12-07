// BOJ_1373_2진수 8진수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1373 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        /* ==========sol========== */
        /* ==========output========== */
        if(str.length()%3==1){
            System.out.print(str.charAt(0));
        }else if(str.length()%3==2){
            System.out.print((str.charAt(0)-'0')*2 +(str.charAt(1)-'0'));
        }
        for(int i=str.length()%3;i<str.length();i+=3){
            System.out.print((str.charAt(i)-'0')*4+(str.charAt(i+1)-'0')*2 +(str.charAt(i+2)-'0'));
        }
        br.close();
    }
}
