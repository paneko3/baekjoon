// BOJ_2754_학점계산

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2754 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str= br.readLine();
        if(str.equals("F")){
            System.out.println("0.0");
        }else {
            double result=0.0;
            switch (str.charAt(0)){
                case 'A':
                    result+=4;
                    break;
                case 'B':
                    result+=3;
                    break;
                case 'C':
                    result+=2;
                    break;
                case 'D':
                    result+=1;
                    break;
            }
            switch (str.charAt(1)){
                case '+':
                    result+=0.3;
                    break;
                case '0':
                    result+=0.0;
                    break;
                case '-':
                    result-=0.3;
                    break;
            }
            System.out.println(result);
        }
        br.close();
    }
}
