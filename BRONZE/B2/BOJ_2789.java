// BOJ_2789_유학 금지

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2789 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String cam = "CAMBRIDGE";
        /* ==========sol========== */
        /* ==========output========== */
        Loop:for(int i=0;i<str.length();i++){
            for(int j=0;j<cam.length();j++){
                if(str.charAt(i)==cam.charAt(j)){
                    continue Loop;
                }
            }
            System.out.print(str.charAt(i));
        }
        br.close();
    }
}