// BOJ_2153_소수 단어

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2153 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        /* ==========sol========== */
        int result = 0;
        for(int i=0;i<str.length();i++){
            result+= str.charAt(i)>='a'?str.charAt(i)-'a'+1:str.charAt(i)-'A'+27;
        }
        /* ==========output========== */
        for(int i=2;i*i<=result;i++){
            if(result%i==0){
                System.out.println("It is not a prime word.");
                return;
            }
        }
        System.out.println("It is a prime word.");
        br.close();
    }
}