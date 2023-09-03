// BOJ_15873_공백 없는 A+B

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_15873 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String AB = br.readLine();
        /* ==========sol========== */
        int A = 0;
        int B = 0;
        if(AB.length()==4){
            A=10;
            B=10;
        } else if(AB.length()==3){
            if(AB.charAt(1)=='0'){
                A=10;
                B=AB.charAt(2)-'0';
            }else {
                A=AB.charAt(0)-'0';
                B=10;
            }
        }else {
            A=AB.charAt(0)-'0';
            B=AB.charAt(1)-'0';
        }
        /* ==========output========== */
        System.out.println(A+B);
        br.close();
    }
}