// BOJ_2495_연속구간

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2495 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<3;i++){
            int result = 0;
            String str = br.readLine();
            char temp = str.charAt(0);
            int count = 1;
            for(int j=1;j<8;j++){
                if(temp==str.charAt(j)){
                    count++;
                }else {
                    result=Math.max(result,count);
                    count=1;
                    temp=str.charAt(j);
                }
                result=Math.max(result,count);
            }
            System.out.println(result);
        }
        br.close();
    }
}