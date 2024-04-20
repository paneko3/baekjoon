// BOJ_17389_보너스 점수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_17389 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        /* ==========sol========== */
        int result = 0;
        int bonus = 0;
        for(int i=1;i<=N;i++){
            if(str.charAt(i-1)=='X'){
                bonus=0;
            }else {
                result+=i+bonus;
                bonus++;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}