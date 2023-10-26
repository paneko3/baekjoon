// BOJ_17614_369

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_17614 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int result = 0;
        for(int i=3;i<=N;i++){
            String s = String.valueOf(i);
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='3'||s.charAt(j)=='6'||s.charAt(j)=='9'){
                    result++;
                }
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}