// BOJ_1100_하얀 칸

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1100 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result=0;
        for(int i=0;i<8;i++){
            String str= br.readLine();
            for(int j=0;j<8;j++){
                if(str.charAt(j)=='F'&& i%2==j%2){
                    result++;
                }
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
