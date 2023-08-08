// BOJ_18406_럭키 스트레이트

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_18406 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        /* ==========sol========== */
        int left = 0;
        int right = 0;
        for(int i=0;i<N.length();i++){
            if(i<N.length()/2){
                left+=(N.charAt(i)-'0');
            }else {
                right+=(N.charAt(i)-'0');
            }
        }
        /* ==========output========== */
        System.out.println(left==right?"LUCKY":"READY");
        br.close();
    }
}