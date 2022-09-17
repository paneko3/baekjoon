// BOJ_1550_16진수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1550 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str= br.readLine();
        /* ==========sol========== */
        int result=0;
        for(int i=str.length()-1;i>=0;i--){
            int temp = str.charAt(i)>='A'?str.charAt(i)-'A'+10:str.charAt(i)-'0';
            result+=temp*Math.pow(16,str.length()-1-i);
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
