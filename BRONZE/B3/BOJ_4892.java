// BOJ_4892_숫자 맞추기 게임

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4892 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        int i = 1;
        while ((n=Integer.parseInt(br.readLine()))!=0){
            /* ==========sol========== */
            boolean flag = n%2==0?true:false;
            n*=3;
            n=flag?n/2:(n+1)/2;
            n*=3;
            n/=9;
            /* ==========output========== */
            System.out.println(i + ". " + (flag?"even ":"odd ") + n);
            i++;
        }
        br.close();
    }
}