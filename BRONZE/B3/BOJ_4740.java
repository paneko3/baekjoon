// BOJ_4740_거울, 오! 거울

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4740 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            /* ==========input========== */
            String str = br.readLine();
            /* ==========sol========== */
            if(str.equals("***")){
                break;
            }
            String temp = "";
            for(int i=str.length()-1;i>=0;i--){
                temp+=str.charAt(i);
            }
            /* ==========output========== */
            System.out.println(temp);
        }
        br.close();
    }
}