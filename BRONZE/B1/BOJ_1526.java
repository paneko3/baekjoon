// BOJ_1526_가장 큰 금민수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1526 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int result = 0;
        LOOP:for(int i=4;i<=N;i++){
            String str = String.valueOf(i);
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)!='4'&& str.charAt(j)!='7'){
                    continue LOOP;
                }
            }
            result=Integer.parseInt(str);
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}