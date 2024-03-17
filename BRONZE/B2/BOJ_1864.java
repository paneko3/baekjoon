// BOJ_1864_문어 숫자

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1864 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            /* ==========input========== */
            String str = br.readLine();
            /* ==========sol========== */
            if(str.equals("#")){
                break;
            }
            int result = 0;
            for(int i=0;i<str.length();i++){
                int n = 0;
                switch (str.charAt(i)){
                    case '-': n=0;
                        break;
                    case '\\': n=1;
                        break;
                    case '(': n=2;
                        break;
                    case '@': n=3;
                        break;
                    case '?': n=4;
                        break;
                    case '>': n=5;
                        break;
                    case '&': n=6;
                        break;
                    case '%': n=7;
                        break;
                    case '/': n=-1;
                        break;
                }
                result += n*Math.pow(8,str.length()-i-1);
            }
            /* ==========output========== */
            System.out.println(result);
        }
        br.close();
    }
}