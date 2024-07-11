// BOJ_4806_줄 세기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4806 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        String str;
        while ((str=br.readLine())!=null){
            result++;
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}