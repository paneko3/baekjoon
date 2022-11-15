// BOJ_2744_대소문자 바꾸기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2744 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
                System.out.print((char) ('A'+str.charAt(i)-'a'));
            }else {
                System.out.print((char)('a'+str.charAt(i)-'A'));
            }
        }
        br.close();
    }
}
