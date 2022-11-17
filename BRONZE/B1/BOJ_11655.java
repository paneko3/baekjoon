// BOJ_11655_ROT13

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11655 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
                System.out.print((char)('a'+ ('a'+str.charAt(i)+1)%26));
            }else if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
                System.out.print((char)('A'+ ('A'+str.charAt(i)+13)%26));
            }else {
                System.out.print(str.charAt(i));
            }
        }
        br.close();
    }
}
