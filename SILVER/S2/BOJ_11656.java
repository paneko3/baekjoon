// BOJ_11656_접미사 배열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_11656 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String[] suffixs=new String[S.length()];
        for(int i=0;i<S.length();i++){
            suffixs[i]=new String(S.substring(i,S.length()));
        }
        Arrays.sort(suffixs);
        /* ==========output========== */
        for(String suffix: suffixs){
            System.out.println(suffix);
        }
        br.close();
    }
}
