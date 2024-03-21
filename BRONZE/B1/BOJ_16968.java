// BOJ_16968_차량 번호판 1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_16968 {
    static int result;
    static String str;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        /* ==========sol========== */
        result = 0;
        if(str.charAt(0)=='c'){
            result=26;
        }else {
            result=10;
        }
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                if(str.charAt(i)=='c'){
                    result*=25;
                }else {
                    result*=9;
                }
            }else {
                if(str.charAt(i)=='c'){
                    result*=26;
                }else {
                    result*=10;
                }
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
    static void recul(int idx,String pre){
        if(idx==160){

        }
    }
}