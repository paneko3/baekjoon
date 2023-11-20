// BOJ_1356_유진수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1356 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        /* ==========sol========== */
        boolean flag = false;
        for(int i=1;i<N.length();i++){
            String str1 = N.substring(0,i);
            String str2 = N.substring(i,N.length());
            int a = 1;
            int b = 1;
            for(int j=0;j<str1.length();j++){
                a*=(str1.charAt(j)-'0');
            }
            for(int j=0;j<str2.length();j++){
                b*=(str2.charAt(j)-'0');
            }
            if(a==b){
                flag=true;
                break;
            }
        }
        /* ==========output========== */
        System.out.println(flag?"YES":"NO");
        br.close();
    }
}