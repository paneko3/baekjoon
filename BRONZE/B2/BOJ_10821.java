// BOJ_10821_정수의 개수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10821 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        /* ==========sol========== */
        int result = 0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)==','){
                result++;
            }
        }
        /* ==========output========== */
        System.out.println(result+1);
        br.close();
    }
}