// BOJ_29863_Arno's Sleep Schedule

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_29863 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());;
        /* ==========sol========== */
        /* ==========output========== */
        System.out.println(a>b?24-a+b:b-a);
        br.close();
    }
}