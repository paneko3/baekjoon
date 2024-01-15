// BOJ_6378_디지털 루트

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_6378 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            /* ==========input========== */
            String str = br.readLine();
            /* ==========sol========== */
            if(str.equals("0")){
                break;
            }
            String temp = "";
            boolean flag = false;
            while (str.length()!=1){
                int sum = 0;
                for(int i=0;i<str.length();i++){
                    sum += str.charAt(i) - '0';
                }
                str = String.valueOf(sum);
            }
            /* ==========output========== */
            System.out.println(str);
        }
        br.close();
    }
}