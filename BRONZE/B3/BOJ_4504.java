// BOJ_4504_배수 찾기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4504 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        /* ==========output========== */
        while (true){
            int m = Integer.parseInt(br.readLine());
            if(m==0){
                break;
            }
            if(m%n==0){
                System.out.println(m + " is a multiple of " + n +".");
            }else {
                System.out.println(m + " is NOT a multiple of " + n +".");
            }
        }
        br.close();
    }
}