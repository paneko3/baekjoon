// BOJ_5586_JOI와 IOI

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5586 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        /* ==========sol========== */
        int result1 = 0;
        int result2 = 0;
        for(int i=0;i<str.length()-2;i++){
            if(str.charAt(i)=='J'){
                if(str.charAt(i+1)=='O'&&str.charAt(i+2)=='I'){
                    result1++;
                }
            }else if(str.charAt(i)=='I'){
                if(str.charAt(i+1)=='O'&&str.charAt(i+2)=='I'){
                    result2++;
                }
            }
        }
        /* ==========output========== */
        System.out.println(result1);
        System.out.println(result2);
        br.close();
    }
}