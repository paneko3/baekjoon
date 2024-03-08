// BOJ_17202_핸드폰 번호 궁합

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_17202 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();
        String str = "";
        for(int i=0;i<8;i++){
            str += A.charAt(i);
            str += B.charAt(i);
        }
        /* ==========sol========== */
        while (str.length()!=2){
            String temp = "";
            for(int i=0;i<str.length()-1;i++){
                int num = str.charAt(i)-'0' + str.charAt(i+1)-'0';
                temp+=num>=10?num-10:num;
            }
            str = new String(temp);
        }
        /* ==========output========== */
        System.out.println(str);
        br.close();
    }
}