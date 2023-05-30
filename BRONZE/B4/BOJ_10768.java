// BOJ_10768_특별한 날

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10768 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        /* ==========output========== */
        if(m<2){
            System.out.println("Before");
        }else if(m>2){
            System.out.println("After");
        }else {
            if(d<18){
                System.out.println("Before");
            }else if(d>18){
                System.out.println("After");
            }else {
                System.out.println("Special");
            }
        }
        br.close();
    }
}