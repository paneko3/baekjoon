// BOJ_11816_8진수, 10진수, 16진수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11816 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        /* ==========sol========== */
        /* ==========output========== */
        if(str.charAt(0)=='0'){
            if(str.length()>=2&&str.charAt(1)=='x'){
                System.out.println(Integer.valueOf(Integer.parseInt(str.substring(2),16)));
            }else {
                System.out.println(Integer.valueOf(Integer.parseInt(str.substring(1),8)));
            }
        }else {
            System.out.println(str);
        }
        br.close();
    }
}