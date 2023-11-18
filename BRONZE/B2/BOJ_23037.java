// BOJ_23037_5의 수난

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_23037 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        /* ==========sol========== */
        int result = 0;
        for(int i=0;i<str.length();i++){
            result+=Math.pow((int)(str.charAt(i)-'0'),5);
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}