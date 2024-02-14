// BOJ_2998_8진수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_2998 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        /* ==========sol========== */
        String result = "";
        while(str.length()%3 != 0) {
            str = "0" + str;
        }
        for(int i=0; i<str.length()-1; i+=3) {
            int a1 = str.charAt(i) - '0';
            int a2 = str.charAt(i+1) - '0';
            int a3 = str.charAt(i+2) - '0';
            result += Integer.toString((a1*4) + (a2*2) + (a3*1));
        }
        /* ==========output========== */
        System.out.println(result);
         br.close();
    }
}