// BOJ_1357_뒤집힌 덧셈

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1357 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        while (X%10==0){
            X/=10;
        }
        while (Y%10==0){
            Y/=10;
        }
        String strX = "";
        String strY = "";
        for(int i=Integer.toString(X).length()-1;i>=0;i--){
            strX = strX + Integer.toString(X).charAt(i);
        }
        for(int i=Integer.toString(Y).length()-1;i>=0;i--){
            strY = strY + Integer.toString(Y).charAt(i);
        }
        int result = Integer.parseInt(strX)+Integer.parseInt(strY);
        while (result%10==0){
            result/=10;
        }
        for(int i=Integer.toString(result).length()-1;i>=0;i--){
            System.out.print(Integer.toString(result).charAt(i));
        }
        /* ==========output========== */
        br.close();
    }
}
