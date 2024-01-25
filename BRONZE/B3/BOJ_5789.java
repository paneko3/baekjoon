// BOJ_5789_한다 안한다

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            /* ==========input========== */
            String str = br.readLine();
            /* ==========sol========== */
            /* ==========output========== */
            if(str.charAt(str.length()/2-1)==str.charAt(str.length()/2)){
                System.out.println("Do-it");
            }else {
                System.out.println("Do-it-Not");
            }
        }
        br.close();
    }
}