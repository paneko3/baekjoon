// BOJ_4458_첫 글자를 대문자로

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4458 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            String str =br.readLine();
            System.out.print(str.substring(0,1).toUpperCase());
            System.out.println(str.substring(1));
        }
        br.close();
    }
}