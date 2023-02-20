// BOJ_10987_모음의 개수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10987 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        /* ==========sol========== */
        int result=0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                result++;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
