// BOJ_2954_창영이의 일기장

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2954 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        /* ==========sol========== */
        String result = "";
        int i;
        for(i=0;i<str.length();i++){
            char c = str.charAt(i);
            result+=c;
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                i+=2;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}