// BOJ_11648_지속

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11648 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int result = 0;
        while (N>=10){
            result++;
            String str = String.valueOf(N);
            int temp = str.charAt(0)-'0';
            for(int i=1;i<str.length();i++){
                temp *= (str.charAt(i)-'0');
            }
            N=temp;
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}